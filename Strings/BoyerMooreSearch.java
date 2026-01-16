public class BoyerMooreSearch {

    // Build bad character table: last index of each character in pattern
    static int[] buildBadCharTable(String pattern) {
        int[] badChar = new int[256];

        // fill all with -1 (means character not present in pattern)
        for (int i = 0; i < 256; i++) {
            badChar[i] = -1;
        }

        // store last occurrence of each character
        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i;
        }

        return badChar;
    }

    // Search pattern in text
    static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m > n) return;

        int[] badChar = buildBadCharTable(pattern);

        int shift = 0; // current alignment of pattern with text

        while (shift <= n - m) {
            int j = m - 1; // start comparing from end of pattern

            // move j left while characters match
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            // if j < 0 => full pattern matched
            if (j < 0) {
                System.out.println("Pattern found at index: " + shift);

                // shift pattern for next possible match
                if (shift + m < n) {
                    shift += m - badChar[text.charAt(shift + m)];
                } else {
                    shift += 1;
                }
            } else {
                // mismatch occurred -> apply bad character rule
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
