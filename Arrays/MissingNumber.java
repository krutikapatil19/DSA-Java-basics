public class MissingNumber {
    public void FindMissingNumber(int n){
        int a = 2;
        int b = 4;
        int c = 0;

        for(int i = 2; i<=4; i++){
             c = a + b + 2;
             a = b;
             b = c;
        }
        System.out.println("The value of x is : " + c);
    }
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        obj.FindMissingNumber(5);
    }
}
