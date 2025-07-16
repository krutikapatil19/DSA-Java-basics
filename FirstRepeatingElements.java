import java.util.*;
public class FirstRepeatingElements {
    public static int FirstRepeatingElement(int[] arr){
        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(seen.contains(arr[i])){
                return arr[i];                                  //First repeating element
            } else {
                seen.add(arr[i]);
            }
        }
        return -1;                                              //no repeating element
    }
    public static void main(String[] args){
        int[] arr = {10,5,7,9,10,4};
        System.out.println("First repeating element is : " + FirstRepeatingElement(arr));
    }
    
}
