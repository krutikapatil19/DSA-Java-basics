import java.util.HashMap;
public class LargestUniqueSubstringLength {
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        for(int end = 0; end<s.length(); end++) {
            char c = s.charAt(end);

            //If character seen before, move start
            if(map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end);    // store/update latest index
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
