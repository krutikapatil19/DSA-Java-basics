public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;// keeps track of the largest water area found so far.

        while (left < right) {
            int width = right - left;// distance between two lines
            int heightt = Math.min(height[left], height[right]);// the height of water depends upon shorter line,because water can't go above it.
            int currentArea = width * heightt;
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            // Moving the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}

/*
 * Complexitites
 * Time: O(n)
 * Space: O(1)
 */