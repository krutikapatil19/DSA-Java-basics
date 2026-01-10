public class WildcardStringMatching {
    public static boolean isMatch(String text, String pattern) {
        int i = 0;
        int j = 0;

        int starIndex = -1;
        int matchIndex = 0;

        while (i< text.length()) {

            //Case1: characters match or pattern has '?'
            if(j < pattern.length() && (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '?')){
                i++;
                j++;
            }

            //Case2: pattern has '*'
            else if(j<pattern.length() && pattern.charAt(j) == '*'){
                starIndex = j;
                matchIndex = i;
                j++;
            }
            //Case3: mismatch, but we have seen '*' before
            else if (starIndex != -1) {
                j = starIndex + 1;
                matchIndex++;
                i = matchIndex;
            }

            //Case 4 : mismatch and no '*'
            else {
                return false;
            }
        }

        //Skip remaining '*' in pattern
        while(j< pattern.length() && pattern.charAt(j) == '*') {
            j++;
        }
        return j == pattern.length();
    }
    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "baa*a?";

        System.out.println(isMatch(text, pattern));
    }
}
