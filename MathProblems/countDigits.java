public class countDigits {
    public static int digitsCount(int n ){
        int count = 0;
        while(n != 0){
            n = n /10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 3241;
        int result = digitsCount(n);
        System.out.println("Number of digits : " + result);
    }
}