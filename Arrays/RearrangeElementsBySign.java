import java.util.ArrayList;
import java.util.Arrays;
public class RearrangeElementsBySign {
    public static int[] rearrangeElements(int[] nums) {

        //Step 1: Create two arrays/lists for positive and negatives

        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        //2. store positives and negatives separatey
        for(int i = 0;i<nums.length;i++){
            if (nums[i] >0){
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }
        //3. Create answer array of same size
        int[] ans = new int[nums.length];

        //4.Fill alternatively:
        int p = 0, n = 0;

        for(int i = 0; i< nums.length; i++) {
            if( i% 2 == 0) {
                ans[i] = positives.get(p);
                p++;
            }else{
                ans[i] = negatives.get(n);
                n++;
            }
        }
        return ans;
    }

    
    public static void main(String[] args) {
        int[] nums = {3,-1,-2,5,8,-6,2,-4};

        int[] result = rearrangeElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
