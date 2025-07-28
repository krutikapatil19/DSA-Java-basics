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
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Subtract character counts using str2
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
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
