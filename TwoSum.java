import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args){
        int[] arr={3,6,10,15,20};
        int target=25;

        HashMap<Integer, Integer> map = new HashMap<> ();               //create the hashmap to store numbers and their indices
                                                                        //Key=number from array , value=its index

        for(int i=0;i<arr.length; i++){
            int currentNum = arr[i];                                    //current number in the array
            int requiredNum = target-currentNum;                        //no. required to reach the target


            if(map.containsKey(requiredNum)){                           //check if req number is already in the map
                System.out.println("Indices : " + map.get(requiredNum) + " , " + i);    //if found , print the indices and the actual numbers
                System.out.println("Numbers :" + requiredNum + " + " + currentNum + " = " + target);
                return;
            }
            map.put(currentNum,i);                                       //it lets the next number find a match from the past
        }
        System.out.println("No two numbers add up to the Target");
        
    }
    
}
