public class RangeBitwiseAND {
    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        // Shift both left and right until they become equal
        while (left != right) {
            left >>= 1;   // right shift
            right >>= 1;
            shift++;      // count number of shifts
        }

        // Shift back to get final answer
        return left << shift;
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 7;

        int result = rangeBitwiseAnd(left, right);
        System.out.println("Result: " + result);
    }
}
