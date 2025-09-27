package Recursion;

public class Factorial {
    public static int factorial(int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        //Recursive Case
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Factorial of " + n   +  " is : " + factorial(n));
    }
}
