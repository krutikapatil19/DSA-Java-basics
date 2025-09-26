public class pyramidPattern {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 0; i <= n; i++) {                              //outer loop - for printing n rows    
            for (int s=1; s<= n-i; s++) {                           //to print spaces before stars.
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i + 1); star++) {       //stars in each row  - formula - 
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


