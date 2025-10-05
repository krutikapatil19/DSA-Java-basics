//You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 can be of different sizes
/*Input Format
First line consists of an integer n1
Second line consists of n1 spaced integers, representing elements of arr1
Third line consists of an integer n2Fourth line consists of n2 spaced integers, representing elements of arr2
Output Format : Subtract the two numbers and print the array
Example 
Input
3
3 2 1
3
1 2 3

Output:
1
9
8
*/
public class prac1 {
    public static long subtractArray( int[] arr1, int[] arr2){
        long a = 0;
        long b = 0;
        for(int i = 0;i<arr1.length; i++){
            a = a * 10 + arr1[i];
        }
        for(int i = 0; i<arr2.length; i++){
            b = b*10 + arr2[i];
        }
        long c = a - b;
        return c;
    }
    
    public static void main(String[] args){
        int[] arr1 = {3,2,1};
        int[] arr2 = {2,3};
        long result = subtractArray(arr1, arr2);

        String res = Long.toString(result);
        for(int i = 0;i<res.length(); i++){
            System.out.println(res.charAt(i));
        }
    }
    }
