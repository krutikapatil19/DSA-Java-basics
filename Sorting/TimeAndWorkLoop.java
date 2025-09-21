import java.util.*;

public class TimeAndWorkLoop {

    public static double solveByLoop(int X, int Y, int Z) {
        double totalWork = 1.0;
        double workA = 1.0 / X;
        double workB = 1.0 / Y;

        int days = 0;

        // Step 1: First Z days, both work together
        for (int i = 0; i < Z && totalWork > 0; i++) {
            totalWork -= (workA + workB);
            days++;
        }

        // Step 2: After Z days, B works alone
        while (totalWork > 0) {
            totalWork -= workB;
            days++;
        }

        return days; // total days counted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A’s days, B’s days, and working-together days: ");
        int X = sc.nextInt(); // A’s days
        int Y = sc.nextInt(); // B’s days
        int Z = sc.nextInt(); // days together

        double totalDays = solveByLoop(X, Y, Z);
        System.out.println("Total days required = " + totalDays);
    }
}
