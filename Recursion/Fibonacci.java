public class Fibonacci{
    public static int fibonacci(int n) {
        
        //Base Case
        if(n==0){                                               //if number is 0 , return 0.
            return 0;
        }else if (n == 1) {                                     //if number is 1 , return 1.
            return 1;
        }else{
            //Recursive case : Sum of previous 2 fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n-2);           //fib(6) = fib(4)+fib(3)
            }
        }
        public static void main(String [] args){
            int n = 6;
            System.out.println(fibonacci(n));
        }
    }