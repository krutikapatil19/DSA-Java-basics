
public class PrintDuplicates {
    public static String printDuplicates(String s){
        if (s == null || s.isEmpty()) {
            return "No duplicates";
        }
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {                                    //converts string into characters
            freq[c]++;
        }

        StringBuilder result = new StringBuilder();
        boolean found = false;

        for(int i = 0; i<freq.length; i++) {
            if (freq[i] > 1) {                                              //When a character appears more than once , then its a duplicate , print the character along with its frequency.
                System.out.println(" ' " + (char)i + " ' ->" + freq[i]);    //convert index i back to character, Print Character and its count.
                found = true;
            }
        }
        if (!found) {                                                       //No duplicates found   
            return "No duplicates found.";
    }
    return result.toString();                                               //Converts StringBuilder to String , and return it.
}

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(printDuplicates(s));
    }
}