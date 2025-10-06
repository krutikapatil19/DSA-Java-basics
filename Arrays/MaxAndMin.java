public class MaxAndMin {
    public static int MaxVal(int[] arr) {
        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int MinVal(int[] arr) {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 10, 14, 20, 250, };
        System.out.println(
                "The Maximum value and Minimum value in the array is : " + MaxVal(arr) + " and " + MinVal(arr));
    }
}