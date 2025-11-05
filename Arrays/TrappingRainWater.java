public class TrappingRainWater {
    public static int FindTotalWater(int[] height) {
        int leftMax = 0, rightMax = 0; // Inititalizing leftMax and rightMax to keep a track of Max height of bar seen
                                       // so far at the left and right
        int left = 0, right = height.length - 1;
        int totalWater = 0; // keeps track of total water trapped

        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax > height[left]) {
                    totalWater += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
                left++;
            } else {
                if (rightMax > height[right]) {
                    totalWater += rightMax - height[right];
                } else {
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
