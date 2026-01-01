public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveChars(String s) {

        //StringBuilder for efficient string building
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i< s.length(); i++) {

            //add first character OR
            //add only if current char is different from last added character
            if(i == 0 || s.charAt(i) != s.charAt(i-1)) {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s = "IamFeelinggSooHappyyy";
        System.out.println(removeConsecutiveChars(s));
    }
}
