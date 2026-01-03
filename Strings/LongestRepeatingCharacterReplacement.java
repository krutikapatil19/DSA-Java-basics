public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];   //frequency of each character from A-Z
        int start = 0;
        int maxFreq = 0;            //max frequency in current window 
        int maxLen = 0;

        for(int end = 0;end<s.length(); end++) {            //expands the window one character at a time 
            char c = s.charAt(end);                         //Take the current character at position end 
            freq[c-'A']++;                                  //Increase count of that character in the window 

            //update max frequency
            maxFreq = Math.max(maxFreq, freq[c-'A']);       //Update the most frequent character count 

            //if replacement needed > k, shrink window
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

/*I used Sliding window to expand or shrink the window size.
Flow of the solution:
1.Start with an empty window
2.Expand window to the right(include more characters)
3.Keep track of : character counts, most frequent character

*Key Formula:
characters to change = window size - frequency of most common character

If :
    window size - maxFreq <= k
    Then window is valid ✅

Else : 
    window size - maxFreq >k
    Then window is INVALID ❌(too many changes needed)
    
4.If window becomes invalid() 
*/