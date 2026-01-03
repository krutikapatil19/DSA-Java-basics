public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int start = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int end = 0;end<s.length(); end++) {
            char c = s.charAt(end);
            freq[c-'A']++;

            //update max frequency
            maxFreq = Math.max(maxFreq, freq[c-'A']);

            //if replacement needed>k, shrink window
            if ((end-start+1) - maxFreq > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            //update answer
            maxLen = Math.max(maxLen, end - start +1);
        }
        return maxLen;

    }
    public static void main(String[] args){
        String s  = "AABABBA";
        int  k = 1;
        System.out.println(characterReplacement(s,k));
    }
}
