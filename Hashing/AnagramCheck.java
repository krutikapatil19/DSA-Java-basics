
import java.util.HashMap;
public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {

        // If lengths are not equal, the strings can't be anagrams
        if (str1.length() != str2.length()) return false;

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Create hashmap to count character frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in str1
        for (char ch : str1.toCharArray()) {                          //get each character from string1
            map.put(ch, map.getOrDefault(ch, 0) + 1);    //get how many times the letter was there in the string , if it wasnt there , consider it 0 and add 1 , or increase the count , if it was already there.
        }

        // Subtract character counts using str2
        for (char ch : str2.toCharArray()) {                           //get each character from string 2
            if (!map.containsKey(ch)) return false;                    //if the character is not found in the map , it's not an anagram
            map.put(ch, map.get(ch) - 1);                              //reduce the count of the character by 1
            if (map.get(ch) == 0) {                                    //if the character counts become 0
                map.remove(ch);                                        //remove it from the map
            }
        }

        // If map is empty, they are anagrams
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}
