public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
    int j = 0; // slow pointer

    for (int i = 1; i < arr.length; i++) { // fast pointer
        if (arr[i] != arr[j]) {
            j++;
            arr[j] = arr[i];
        }
    }
    return j + 1;
}
    public static void main(String [] args){
        int [] arr = {5, 6, 6,8 , 9, 10,15,30 };

        System.out.println(removeDuplicates(arr));
        
    }
}
// i moves fast to check every element.
// j moves slow and stores only unique elements.
// If arr[i] != arr[j] -> j++ and copy arr[i] to arr[j]. (This returns the number of unique elements)
