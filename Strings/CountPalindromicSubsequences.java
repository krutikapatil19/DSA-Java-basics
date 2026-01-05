public class CountPalindromicSubsequences {

    static long countPS(String s) {
        int n = s.length();

        // dp[i][j] stores number of palindromic subsequences in s[i..j]
        long[][] dp = new long[n][n];

        // single characters are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // consider substrings of length 2 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countPS(s)); 
    }
}
