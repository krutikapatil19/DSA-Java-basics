public class maxProduct {
    public static int max_Product(int[] nums){
        if(nums == null || nums.length == 0)return 0;

        int n = nums.length;
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int result = nums[0];

        for(int i = 1; i<n; i++) {  //doubt , why not take i = 0;
            //int x = nums[i];
            //If we multiply by a negative, max and min swap roles
            if(nums[i] < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            //Start fresh or extend previous product
            maxEndingHere = Math.max(nums[i], maxEndingHere * nums[i]);
            minEndingHere = Math.min(nums[i], minEndingHere*nums[i]);           //doubt , why to keep track of minEndingHere

            //Update global maximum
            result = Math.max(result, maxEndingHere);           //doubt - underbracket result ??
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-2,3,-4};
        System.out.println(max_Product(nums));
    }
}

