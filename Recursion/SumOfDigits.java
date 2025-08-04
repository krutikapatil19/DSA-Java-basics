public class SumOfDigits {
    public static int sumofDigits(int n ){
        //Base Case : If number becomes 0 ,then sum is 0.
        if(n == 0){
            return 0;
        }
        //Recursive Case: last digit + sum of remaining digits
        return (n % 10) + sumofDigits(n / 10);
    }
    
    public static void main(String[] args){
        int n = 1234;                               // n%10 =4   // sumofDigits(n/10)= sumofDigits(123)    //4+6 = 10
        System.out.println(sumofDigits(n));
    }
}
