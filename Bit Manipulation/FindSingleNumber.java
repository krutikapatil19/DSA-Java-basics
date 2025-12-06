public class FindSingleNumber {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;  // XOR cancels out duplicates
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println("Single Number: " + singleNumber(nums));
    }
}
