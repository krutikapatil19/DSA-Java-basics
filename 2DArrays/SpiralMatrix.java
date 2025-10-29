import java.util.*;

public class SpiralMatrix {
public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();
    if(matrix == null || matrix.length == 0) return ans;

    int top = 0;
    int bottom = matrix.length -1;
    int left = 0;
    int right = matrix[0].length - 1;

    while(top <= bottom && left<=right) {
        //go right across top row
        for (int j = left; j<= right; j++) {
            ans.add(matrix[top][j]);
        }
        top++;

        //go down right column
        for(int i = top;i<=bottom;i++){
            ans.add(matrix[i][right]);
        }
        right--;

        if(top<=bottom) {
            //go left across bottom now
            for(int j = right;j>=left;j--) {
                ans.add(matrix[bottom][j]);
            }
            bottom--;
        }
        if(left <= right) {
            //go up left column
            for(int i = bottom; i>= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
    }
    return ans;
}
// for testing
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }
}
