import java.util.*;

public class findAllCombinations {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();//create a list called result -> to store subsets.
        generate(0,nums, new ArrayList<>(), result);//start recursion(we call the helper function to start building subsets )
        return result;
    }
    private static void generate(int index, int[] nums, List<Integer> current, List<List<Integer>>result) {

        //Save the current subset
        result.add(new ArrayList<>(current));//this ensures we get all subsets

        //Try picking every possible next element to add to the subset
        for(int i = index; i<nums.length; i++) {//for ex: if index = 0 -> then try 1, then 2 //If index = 1-> then try 2 only //If index = 2->loop ends
            current.add(nums[i]);//pick the element
            generate(i+1, nums, current, result);//go deeper
            current.remove(current.size() - 1);//undo pick(backtrack)
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