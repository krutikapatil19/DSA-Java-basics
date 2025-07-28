//Count Frequency of Each Element in an Array using HashMap approach
import java.util.HashMap;

public class CountFrequency {

    //Function to count frequency of elements
    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();                             //created a new HashMap object , named map, it stores key-value pairs.

    //Loop through each element in the array 
    for(int num : arr) {
        //If num already exists , increase count by 1. Else , put 1.
        map.put(num, map.getOrDefault(num, 0) + 1);                //getOrDefault = Get value if present, else use default.
        }
    return map;
}
public static void main(String[] args) {
    int [] arr = {5,7,8,20,8,9,7,8};

    HashMap <Integer, Integer> result = countFrequency(arr);

    System.out.println("Element | Frequency");
    for( int key : result.keySet()) {
        System.out.println(" "  + key +  "      |   " + result.get(key));
   }
  }
}
