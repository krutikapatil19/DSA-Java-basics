import java.util.*;

public class findAllCombinations {

    static void findCombinations(int[] arr, int r) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        generate(arr, 0, r, current, result);

        // print all combinations

        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }

    // Helper function to build combinations

    private static void generate(int[] arr, int ind, int r,
                                 List<Integer> current, List<List<Integer>> result) {

        // if we formed a combination of size r → save it
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }

        // loop through all possible remaining choices
        for (int i = ind; i < arr.length; i++) {

            current.add(arr[i]);           // choose element
            generate(arr, i + 1, r, current, result); // go deeper
            current.remove(current.size()-1); // backtrack
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        findCombinations(arr, 2);
    }
}
