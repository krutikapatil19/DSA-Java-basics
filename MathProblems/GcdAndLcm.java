public class GcdAndLcm {
    public static int findGCD(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b){
        return(a*b) / findGCD(a,b);
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 48;

        //Call methods to get GCD and LCM
        int gcd = findGCD(a,b);
        int lcm = findLCM(a,b);

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

    }
}