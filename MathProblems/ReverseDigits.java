public class ReverseDigits {
    public static int DigitsReversed(int n){
    int reversed = 0;
        while (n!= 0){
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
    public static void main(String[] args){
        int n = 1234;
        int result = DigitsReversed(n);
        System.out.println("Reversed number = " + result);
        }
    }
