public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        //1. Edge case 1: If s is smaller than t -> return ""
        if (s.length() < t.length())return "";

        //2. Frequency map for characters of t
        int[] freq = new int[256];

        for (char c : t.toCharArray()) {
            freq[c]++;                          //Take each character c from t , and Increase the count at position c
        }

        //3.Initializing sliding window pointers
        int left = 0;
        int right = 0;

        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {
            //expanding the window
            char c = s.charAt(right);       //take current character
            freq[c]--;                      //include it in window

            if (freq[c] >= 0) {             //if this character was needed
                matched++;
            }

            while (matched == t.length()) {

                //1. Update minimum window
                int windowLen = right - left + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = left;
                }

                //2. Remove left character from window
                char leftChar = s.charAt(left);
                freq[leftChar]++;

                //3.IF removing breaks validity, reduce matched
                if(freq[leftChar] > 0) {
                    matched--;
                }

                //4.Move left pointer
                left++;
            }
            right ++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(startIndex, startIndex + minLen);
       
    }
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
