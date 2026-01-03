import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {         //This is a method that takes an array of strings as input and returns a list of lists.(Each inner list will contain words that are anagrams of each other).
        Map<String, List<String>> map = new HashMap<>();                    //Here HashMap is created . Key will be a string, and value will be a List<String> that stores all words that match that sorted form.

        for (String s : strs) {
            char[] chars = s.toCharArray();                                 //This converts the current word into a character array.
            Arrays.sort(chars);                                             // sort characters in array 
            String key = new String(chars);                                 // sorted string as key

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);        //It means if the map does not already contain this key, create a new empty list for it. Then add the og word 's' to the list for that key. (So all words with the same sorted key are grouped together).
        }

        return new ArrayList<>(map.values());                               //map.values() -> gives all the grouped lists stored in the map. We convert it into an ArrayList and return it.
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}
