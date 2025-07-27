import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public char firstNonRepeatingChar(String str) {

        str = str.toLowerCase();                                    //converting input to LowerCase
        HashMap<Character, Integer> map = new HashMap<>();          //map to count frequency

        //Step 1 : Count Frequency of each character
        for (int i =0; i< str.length(); i++){
            char ch = str.charAt(i);                                //get current character
            map.put(ch, map.getOrDefault(ch, 0) +1);   //update its count in map
        }

        //Step2: Finding First Non-Repeating Character
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.get(ch) == 1) {
                return ch;
            }
        }
        return '-';                     //if none found , return '-'
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
        String str = "KrutikaPatil";
        char result = obj.firstNonRepeatingChar(str);
        System.out.println("First Non-Repeating character: " + result);
    } 
    
}
