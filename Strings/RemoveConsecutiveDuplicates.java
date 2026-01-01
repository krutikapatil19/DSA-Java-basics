public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveChars(String s) {

        //StringBuilder for efficient string building
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i< s.length(); i++) {

            //add first character OR
            //add only if current char is different from last added character
            if(i == 0 || s.charAt(i) != s.charAt(i-1)) {
                ans.append(s.charAt(i));////append the current character , if its different from the previous one.
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s = "IamFeelinggSooHappyyy";
        System.out.println(removeConsecutiveChars(s));
    }
}

//Approach: Go through the string one character at a time , and build a new String that only gets charcters when they are different from the last one. 
/*Complexities 
Time → O(n) — only one pass
Space → O(n) — for answer string
*/
