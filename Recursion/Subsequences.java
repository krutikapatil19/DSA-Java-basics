public class Subsequences {

    // Recursive function to print all subsequences
    public static void printSubsequences(String str, String current, int index) {
        // Base case: reached the end of the string
        if (index == str.length()) {
            System.out.println(current);  // print current subsequence
            return;
        }

        // Include current character
        printSubsequences(str, current + str.charAt(index), index + 1);

        // Exclude current character
        printSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "", 0);  // start with empty subsequence and index 0
    }
}
