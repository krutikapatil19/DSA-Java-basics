import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n]; // left products
        int[] rightProduct = new int[n]; // right products
        int[] answer = new int[n]; // product of leftProduct and rightProduct

        // left product array
        leftProduct[0] = 1; // nothing is to the left of first element
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        // right product array
        rightProduct[n - 1] = 1;// nothing to the right of last element
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        // Multiply left and right products
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct[i] * rightProduct[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = product(nums);

        System.out.println(Arrays.toString(result));

    }
}