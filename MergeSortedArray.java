import java.util.Arrays;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;               //pointer for num1's valid part //m is the actual value , not pointer ,m is basically the count of actual elements in num1.
        int p2 = n-1;               //pointer for nums2 // n is the count of total elements in num2.
        int p = m + n -1;           //pointer for final merged position in nums1
    
        //merge from back to front
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]){              //comparing the last elements of nums1 and nums2, the element which is greater will get placed to the last position at p pointer
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];               
                p2--;
            }
            p--;
        }
        //if any elements left in nums2, copy them
        while(p2 >= 0){
            nums1[p] =nums2[p2];
            p2--;
            p--;
        }
    }
    public static void main(String[] args){
        int [ ] nums1 = {1,2,7,0,0,0};
        int m = 3;
        int [ ] nums2 = {4,5,6};
        int n = 3;
        MergeSortedArray merger = new MergeSortedArray();
        merger.merge(nums1, m, nums2, n);
        System.out.println("The merged sorted array is: " + Arrays.toString(nums1));
    }
}
