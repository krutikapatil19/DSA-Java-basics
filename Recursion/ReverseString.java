package Recursion;

public class ReverseString {
    public static String reverseString(String str){
    //Base Case: If string is empty or single character , return it .
    if(str.isEmpty()){
        return str;
    }
    //Recursive Case: reverse the rest + first character
    return reverseString(str.substring(1))+ str.charAt(0);
    }
    public static void main(String[] args){
        String s = "Hello" ;
        System.out.println(reverseString(s));
    }
}
