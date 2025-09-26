public class PascalsTriangle {
    public static void printPascalsTriangle(int n){
        for(int i =0; i<n; i++){
            //to print spaces
            for(int s=0; s<n-i-1; s++){                 //formula to print spaces in Pascal's Triangle = n-i-1 . 
                System.out.print(" ");
            }

            int number = 1;
            for (int j=0; j<= i; j++) {
                System.out.print(number + " ");         //the first number will always be 1.
                number = number * (i - j) / (j + 1);    //formula to print the numbers in a row .
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPascalsTriangle(n);
    }
    }