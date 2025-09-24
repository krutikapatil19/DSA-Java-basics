public class DecimalToBinary {
    public static String decimalToBinary(int n) {
        String binary = " ";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return binary;
    }
    public static void main(String[] args){
        int n = 13;
        String result = decimalToBinary(n);
        System.out.println("The conversion of Decimal Number " + n + " to Binary is : " + result);

    }
}
