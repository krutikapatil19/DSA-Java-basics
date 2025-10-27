public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while(left<right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int currentArea = width * h;
            if(currentArea > maxArea) {
                maxArea = currentArea;
            }

            //Moving the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
