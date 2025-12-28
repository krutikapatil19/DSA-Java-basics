public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to long to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        long quotient = 0;

        // Main logic using bit shifting
        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            while ((temp << 1) <= dvd) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            quotient += multiple;
        }

        return sign * (int) quotient;
    }
    public static void main(String[] args) {

        int dividend = 10;
        int divisor = 3;

        int result = divide(dividend, divisor);

        System.out.println("Result: " + result);
    }
}
