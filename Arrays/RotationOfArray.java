public class RotationOfArray {

    // Method to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to rotate array by k steps 
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;

        //In case where the k is greater than n (we take the remainder part only , as the array come in place after one full rotation)
        k = k % n;
        
        // Reverse first part (0 to n-k-1)
        reverse(arr, 0, n - k - 1);

        // Reverse second part (k+1 to n-1)
        reverse(arr, k + 1 , n - 1);

        // Now, reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(arr, k);

        //Print the array after rotation 
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}


//Rotation of array can be done using 2 different methods . In this one I have used Reverse algorithm , inwhich the first part is reversed ,and then second part is reversed , then we reverse the whole array we got . This one is more optimized approach.
//In RotateArray.java file , i have used a method ,in which an extra array , temp,is used to store the array till kth element , and rest of the array is shifted towards left and then the temp array is combined to the right of shifted array.