//Iterative approach 
public class fibonacciSeries {
    public static int[] fibonacci (int n) {
        int[] fib = new int[n];
        int a = 0;
        int b = 1;
        int c;

        //Base Case
        if(n>=1) fib[0] = a;
        if(n>=2) fib[1] = b;

        //Loop for next numbers
        for(int i = 2;i<n;i++){
            c = a+b;
            fib[i] = c;
            a = b;
            b = c;
        }
        return fib;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] result = fibonacci(n);

        //Print all fibonacci numbers
        for(int num:result){
            System.out.print(num + " ");
        }
    }
}