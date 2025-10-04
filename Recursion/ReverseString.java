package Recursion;

public class ReverseString {
    public static String reverseString(String str){
    //Base Case: If string is empty or single character , return it .
    if(str.isEmpty()){
        return str;
    }
    //Recursive Case: reverse the rest + first character
    return reverseString(str.substring(1))+ str.charAt(0);              //str.substring(1) - takes everything excpet the first letter   //str.charAt(0)-adds the first letter at the end.
                                                                                         //for ex. reverse abc = reverseString(bc) + 'a' = [reverseString(c)] + 'b' + 'a'
    }
    public static void main(String[] args){

        
        String s = "Hello" ;
        System.out.println(reverseString(s));
    }
}
