import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[]arr2){

        int i = 0, j = 0;
        int[] result = new int[arr1.length + arr2.length];
        int k = 0;

        //Comparing elements from both arrays
        while (i<arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        //Copy leftover array elements
        while (i < arr1.length) result[k++] = arr1[i++];
        while (j < arr2.length) result[k++] = arr2[j++];

        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] merged = merge(arr1,arr2);

        System.out.println(Arrays.toString(merged));
    }
}