public class TrappingRainWater {
    public static int FindTotalWater(int[] height) {
        int leftMax = 0, rightMax = 0; // Inititalizing leftMax and rightMax to keep a track of Max height of bar seen
                                       // so far at the left and right
        int left = 0, right = height.length - 1;
        int totalWater = 0; // keeps track of total water trapped

        // Move two pointers toward each other
        while (left < right) {
            // Decide which side to process(the shorter one limits water)

            if (height[left] <= height[right]) {
                // If left bar is lower than leftMax, water can be trapped
                if (leftMax > height[left]) {
                    totalWater += leftMax - height[left];
                } else {
                    // Update leftMax when higher bar is found
                    leftMax = height[left];
                }
                left++;
            } else {
                // If right bar is lower than rightMax , water can be trapped
                if (rightMax > height[right]) {
                    totalWater += rightMax - height[right];
                } else {
                    // update rightMax when higher bar is found
                    rightMax = height[right];
                }
                right--;
            }
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(FindTotalWater(height));
    }
}
