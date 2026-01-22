import java.util.HashMap;
public class TwoSumUsingHashMap {

    public void twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();                 //create the hashmap to store numbers and their indices
                                                                         //Key = number from array, value = its index

        for(int i = 0; i< arr.length; i++){
            int currentNum = arr[i];                                    //current number in the array
            int requiredNum = target - currentNum;                      //no. required to reach the target

            if(map.containsKey(requiredNum)) {
                System.out.println("Indices : " + map.get(requiredNum) + " , " + i);      //if found , print the indices and the actual numbers
                System.out.println("Numbers : " + requiredNum + " + " + currentNum + " = " + target);
                return;
            }
            map.put(currentNum, i);                                     //let the next number find a match from the past
        }
        System.out.println("No two numbers add up to the Target");

    }
    public static void main(String[] args){
        int[] arr = {3,5,8,16,2,10};
        int target = 12;
        new TwoSumUsingHashMap().twoSum(arr, target);
    }
}

//Leetcode TwoSumI - we use HashMap for that TwoSum problem ,in which the array is not sorted , and we have to return the Indices of the two numbers  , not the numbers itself.
//Leetcode TwoSum II - for this problem , we use Two Pointers Approach, as we have sorted Array given .  