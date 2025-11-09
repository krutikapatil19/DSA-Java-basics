public class SumInRotatedAndSortedArray {
    public static boolean findPairWithTargetSum(int[] arr, int target) {
        int n = arr.length;

        // Step1:Find the pivot (point of rotation)
        int pivot = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step2: Initialize two pointers
        int left = (pivot + 1) % n; // smallest element
        int right = pivot;

        // Step3: Use two-pointer logic in circular way

        while (left != right) {
            int sum = arr[left] + arr[right];

            // If pair found
            if (sum == target)
                return true;

            // If sum smaller, move left forward(next element)
            if (sum < target)
                left = (left + 1) % n;

            // If sum greater, move right backward(previous element)
            else
                right = (n + right - 1) % n;
        }

        // Step 4: If loop ends, no such pair found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 15, 6, 8, 9, 10 };
        int target = 16;
        System.out.println(findPairWithTargetSum(arr, target));
    }
}
