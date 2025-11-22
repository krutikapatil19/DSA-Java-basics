import java.util.*;

public class LargestConcatenatedNumber{
    public static String LargestNumber(int[] nums) {

        //Step1: Convert all numbers into strings
        String[] s = new String[nums.length];
        for(int i = 0; i<nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        //Step2: Sort using a custom comparator
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));//we compare two possible combinations - (a+b) and(b+a)

        //Step3: If the highest value is "0", return "0"(all were zeroes)(EX Input : [0,0,0], the o/p is 0 ,not 000. Thats why we return 0)
        if(s[0].equals("0")) {
            return "0";
        }

        //Step4: Build the final largest number string
        StringBuilder result = new StringBuilder();
        for(String str : s) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums = {2, 20, 30, 5};
       // LargestConcatenatedNumber obj = new LargestConcatenatedNumber;
        System.out.println(LargestNumber(nums));
    }
}
