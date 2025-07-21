public class RightAngledTriangle {

    // Method to print right-angled triangle pattern
    public void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {         // outer loop for rows
            for (int j = 1; j <= i; j++) {        // inner loop for stars
                System.out.print("* ");
            }
            System.out.println();                
        }
    }

    public static void main(String[] args) {
        RightAngledTriangle obj = new RightAngledTriangle();
        obj.printTriangle(4);               //number of rows
    }
}
