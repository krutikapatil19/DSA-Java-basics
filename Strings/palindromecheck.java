public class palindromecheck {
    public static void main(String [] args){
        String str = "Madam";

        str = str.toLowerCase();            //makes i and j comparison easy if all letters are lowercase

        int i = 0;                          //2 pointers are used .i=start , and j =end of string , to traverse from both sides
        int j = str.length()-1;
        boolean isPalindrome= true;

        while(i<j){                                 //traversal is done from both ends until it reaches the both mid values which are next to each other
            if(str.charAt(i) !=str.charAt(j)){          //to check both values , if the are not equal, string!=palindrom
                 isPalindrome = false;
                 break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("The string is Palindrome");
        }else{
            System.out.println("The String is not palindrome");
        }
    }
    
}
