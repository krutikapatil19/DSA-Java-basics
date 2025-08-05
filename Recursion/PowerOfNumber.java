package Recursion;

public class PowerOfNumber {
    public static int power(int x, int n){

        //Base Case: anything^0 = 1
        if(n==0){
            return 1;
        }
        //Recursive Case: x * (x^(n-1))
        return x * power(x, n-1);                          //multiply once , and let recursion do the rest.   //keep multiplying until the power becomes 0.
    }
    public static void main(String[] agrs){
        int x = 2 , n = 4 ;
    System.out.println("The power of the number x is : " + power(x,n) );
    }
    
}
