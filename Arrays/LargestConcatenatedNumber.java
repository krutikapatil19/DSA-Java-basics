import java.util.Arrays;

public class LargestConcatenatedNumber {

    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";

        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : strNums) sb.append(s);

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {2, 20, 30, 5};
        System.out.println(largestNumber(nums));
    }
}
