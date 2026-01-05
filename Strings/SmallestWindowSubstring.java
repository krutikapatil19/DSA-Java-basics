public class SmallestWindowSubstring {
    public static String smallestWindow(String s, String p) {
        if(s.length() < p.length()) return "";

        int[] freqP = new int[256];
        int[] freqS = new int[256];

        //store frequency of characters of p
        for(char c : p.toCharArray()) {
            freqP[c]++;
        }

        int start = 0;
        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        for(int end = 0; end<s.length(); end++) {
            char c = s.charAt(end);
            freqS[c]++;

            //count matching characters
            if (freqS[c] <= freqP[c]) {
                matched++;
            }
            //when all characters are macthed
            if (matched == p.length()) {

                //shrink window from left
                while (freqS[s.charAt(start)] > freqP[s.charAt(start)] || freqP[s.charAt(start)] ==0) {
                    freqS[s.charAt(start)]--;
                    start++;
                }

                int windowLen = end - start + 1;
                if(windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = start;
                }
            }
        }
        if(startIndex == -1) return "";
        return s.substring(startIndex, startIndex + minLen);
    }
    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";
        System.out.println(smallestWindow(s, p));
    }
}
