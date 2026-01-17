public class BoyerMooreSearch {

    //Build Bad Character Table : It stores the last position(index) of every character in the pattern.
    public static int[] buildBadCharTable(String pattern) {
        int[] badChar = new int[256];       //creates an array of size 256(for ASCII characters).

        for(int i = 0; i<256; i++) {
            badChar[i] = -1;                //setting all values to -1.(as if this character does not exist in the pattern).
        }
        
            //store last occurrence of each character
            for(int i = 0; i<pattern.length(); i++) {
                badChar[pattern.charAt(i)] = i;
            }
        return badChar;//returns the completed table.
    }

    //Search "pattern" in text
    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if(m > n) return;

        int[] badchar = buildBadCharTable(pattern);         //builds the BadChar Table for the pattern.

        int shift = 0;      //shift-where is the pattern currently placed in the text.

        while(shift <= n-m) {
            int j = m - 1;  //start comparing from end of pattern

            //move j left while characters match
            while( j>= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            //if j < 0 => full pattern matched
            if(j < 0) {
                System.out.println("Pattern found at index : " + shift);

                //shift pattern for next possible match
                if(shift + m < n) {
                    shift += m - badChar[text.charAt(shift + m)];
                } else {
                    shift += 1;
                }
            } else {
                //mismatch occurred -> apply bad character rule
                char bad = text.charAt(shift + j);
                shift += Math.max(1, j - badChar[bad]);
            }
        }
    }
    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABC";

        search(text, pattern);
    }
}