public class PrimeNumberCheck {
    public boolean isPrime(int n){
        if (n<= 1)return false;
        
        for(int i =2; i*i<=n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String [] args){
        PrimeNumberCheck obj = new PrimeNumberCheck();
        int n = 7;
        if(obj.isPrime(n)){
            System.out.println("The number is Prime.");
        }else {
        System.out.println("The number is not prime.");
    }
}
}