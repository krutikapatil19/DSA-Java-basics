/*This is the basic approach to check if an array contains duplicates .
In this , I've used in-built Array method which is- Arrays.sort(arr _name)  
It sorts the Array in ascending order , it makes checking duplicates easy. We just have to check adjacent elements , if they are same , then the array contains duplicates. */

import java.util.Arrays;
public class duplicateElementCheck{
    public static boolean duplicatess(int[] arr){
        Arrays.sort(arr);
        for(int i =1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
        public static void main(String[] args){
            int[] arr = {3,1,10,5,29,13,39};
            System.out.println(duplicatess(arr));
        }
    }
    