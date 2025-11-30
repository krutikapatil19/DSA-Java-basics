import java.util.*;

public class findAllCombinations {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(0,nums, new ArrayList<>(), result);
        return result;
    }
    private static void generate(int index, int[] nums, List<Integer> current, List<List<Integer>>result) {

        //Save the current subset
        result.add(new ArrayList<>(current));

        //Try picking every possible next element
        for(int i = index; i<nums.length; i++) {
            current.add(nums[i]);
            generate(i+1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};

        List<List<Integer>> ans = subsets(nums);

        //Print the subsets
        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }
}