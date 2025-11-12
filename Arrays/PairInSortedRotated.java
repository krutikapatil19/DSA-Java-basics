public class PairInSortedRotated {
    public static boolean targetSum(int[] arr, int target) {
        int n = arr.length;
        int pivot = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {// rotation found
                pivot = i;// storing the point of rotation(index) in pivot.
            }
        }
        int left = (pivot + 1 + n) % n;// smallest element
        int right = pivot;// the pivot itself is the largest element

        while (left != right) {// keep looping until both pointers meet(it ensures all possible pairs are checked).
                              
            if (arr[left] + arr[right] == target) {// if sum of two elements equals to target,then pair found!
                return true;
            } else if (arr[left] + arr[right] < target)
                left = (left + 1) % n;// move left pointer forward(towards a bigger number).
            else
                right = (n + right - 1) % n;// if sum is too big , then move right pointer backward(toward a smaller number).
        }

        return false;// no pair adds up to the target.
    }

    public static void main(String[] args) {
        int target = 12;
        int[] arr = { 11, 15, 6, 8, 9, 10 };
        System.out.println(targetSum(arr, target));
    }
}