public class GcdAndLcm {
    public static int findGCD(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 48;

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

    }
}