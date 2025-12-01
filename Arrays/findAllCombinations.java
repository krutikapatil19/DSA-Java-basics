import java.util.*;

public class findAllCombinations {
    public static List<List<Integer>> combinations(int[] nums,int r) {
        List<List<Integer>> result = new ArrayList<>();//stores all combinations of size r.
        generate(0,nums,r, new ArrayList<>(), result);//start recursion(we call the helper function to start building subsets )
        return result;
    }
    private static void generate(int index, int[] nums,int r, List<Integer> current, List<List<Integer>>result) {
        if (current.size() == r){
        //Save the current subset
        result.add(new ArrayList<>(current));//save this combination of size r
        }

        //Try picking every possible next element to add to the subset
        for(int i = index; i<nums.length; i++) {//for ex: if index = 0 -> then try 1, then 2 //If index = 1-> then try 2 only //If index = 2->loop ends
            current.add(nums[i]);//pick the element
            generate(0, nums, r, new ArrayList<>(), result);//go deeper
            current.remove(current.size() - 1);//undo pick(backtrack)
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int r = 2;

        List<List<Integer>> ans = combinations(nums,r);

        //Print the subsets
        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }
}