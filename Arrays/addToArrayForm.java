//Leetcode 989
import java.util.List;
import java.util.ArrayList;
public class addToArrayForm {
    public static List<Integer> addToArrayform(int[] num, int k){
        //starting from last digit
        List<Integer> ans = new ArrayList<>();
        for(int i =num.length-1;i>=0;i--){
            int sum = num[i]+k;                 //current digit+carry
            ans.add(0,sum%10);
            k = sum/10;
        }
        //if any carry left 
        while(k>0){
            ans.add(0,k%10);
            k/= 10;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] num = {3,5,8};
        int k = 91;
        System.out.println(addToArrayform(num,k));
    }
}
