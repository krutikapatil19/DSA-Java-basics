//Find the Most Frequent Element in an Array
//Count Frequency of Each Element in an Array using HashMap approach , and display the element with highest frequency 
import java.util.HashMap;

public class MostFrequentlyOcurringElement {

    //Function to count frequency of elements
    public static int countFrequency(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();                             //created a new HashMap object , named map, it stores key-value pairs.

    //Loop through each element in the array 
    for(int num : arr) {
        //If num already exists , increase count by 1. Else , put 1.
        map.put(num, map.getOrDefault(num, 0) + 1);                //getOrDefault = Get value if present, else use default.
        }
        
        //Find maximum occuring element
        int maxFreq = 0;
        int maxElement = -1;
        for(int key : map.keySet()) {
            if(map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }
        }
        return maxElement;
}
public static void main(String[] args) {
    int [] arr = {5,7,8,20,8,9,7,8};

    int result = countFrequency(arr);

    System.out.println("Most Frequent Element is : " + result);
   
  }
}
