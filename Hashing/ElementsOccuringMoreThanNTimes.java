//find all numbers that appear frequently — specifically, more than one-third of the total size of the array.
//ex: if the array is of length 8 , then n/3 = 8/3 = 2 , so print all the elements appearing more than 2 times.
import java.util.HashMap;

import java.util.HashMap;

public class ElementsOccuringMoreThanNTimes{
    public static void ElementWithNFrequency(int[] arr){
        HashMap <Integer, Integer> map = new HashMap <> ();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        //Print elements occuring more than threshold
        System.out.println("Elements occuring more than n/3 times: ");
        for(int key : map.keySet()) {
            if(map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,2,1,1,1};
        ElementWithNFrequency(arr);
    }

}