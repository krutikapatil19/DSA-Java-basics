import java.util.*;
public class checkDuplicate1 {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet <>();
        for(int num : arr){                                 //for each num belonging to array 
            if(set.contains(num)){                          //check if the set contains the num , if yes,then it is duplicate . If no , then add it to the set.
                return true;
            }
            set.add(num);
        }
        return false;                                       
    }
    public static void main(String[] args){
        int[] arr = {3,9,9,10,12};
        System.out.println(containsDuplicate(arr));
    }
}