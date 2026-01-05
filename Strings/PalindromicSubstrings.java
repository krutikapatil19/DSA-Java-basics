public class PalindromicSubstrings {
    public static int countSubstrings(String s){
        int n = s.length();
        int count = 0;

        for(int i = 0;i<n;i++){
            //odd-length palindromes
            count+= expand(s, i, i);

            //even-length palindromes
            count += expand(s,i,i+1);
        }
        return count;
    }
    private static int expand(String s, int left, int right) {      //expand() func - moves left and right outwards , Each time the chars match , it counts one-palindrome.
        int count = 0;

        while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)) {
            count++;    //found a palindrome 
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}

/* For each index, expand around it(odd and even) and count palindromes.
Complexities 
Time: O(N^2)
Space: O(1)
*/