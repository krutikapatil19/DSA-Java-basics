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