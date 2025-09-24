import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static boolean isArmstrong(int n){

    int originalNumber = n;
    int sum = 0;
    int digits = String.valueOf(n).length();

    //Extract last digit , raise to power, and add to sum .
    while(n > 0) {
        int lastDigit = n%10;
        sum += Math.pow(lastDigit, digits);
        n = n / 10;
    }

    //Compare sum with Original number
    return sum == originalNumber;
    }
    
    public static void main(String[] args){
        int originalNumber = 153;

        if(isArmstrong(originalNumber)){
        System.out.println(originalNumber + " is an Armstrong number.");
        }else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}
