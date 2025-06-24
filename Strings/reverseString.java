public class reverseString {
    public static void main(String[] args){

        String str = "I love solving String questions";
        String reversed = "";

        for(int i = str.length()- 1; i>=0; i--){  //started from last element, then i--
            reversed += str.charAt(i); //concatenating in reverse
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
    
}
