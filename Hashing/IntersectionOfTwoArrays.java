import java.util.HashMap;
public class IntersectionOfTwoArrays {
    public static void Intersection(int[] arr1, int[] arr2){
        HashMap <Integer, Integer> map = new HashMap <> ();

        //Step 1 : Count Frequency of arr1 Elements
        for(int num : arr1){
            map.put(num,  map.getOrDefault(num,0) + 1);
        }

        //Step 2: Check arr2 Elements and print Intersecting Elements
        
        for(int num : arr2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                System.out.println(num);                        //print common element
                map.put(num, map.get(num) - 1);                 //reduce frequency
                }
            }
        }
        public static void main(String[] args) {
            int[] arr1 = {1,2,2,3};
            int[] arr2 = {2,2,4,3};
            
            //Printing the Intersecting Elements
            System.out.println("The Intersecting Elements are:");
            Intersection(arr1, arr2);
        }
        
    }