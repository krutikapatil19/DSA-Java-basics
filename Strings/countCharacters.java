public class countCharacters {
    public static void main(String[] args){
        String str = "Hello! this is my first code of Strings in DSA ";

        int vowels = 0 , consonants=0 , digits=0 , spaces=0;

        for(int i =0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if(Character.isLetter(ch)) {
                if (ch =='a'||ch=='e'|| ch=='i'|| ch =='o'|| ch=='u'){
                vowels++;
                }else {
                consonants++;
            }
        }

        else if (Character.isDigit(ch)){
            digits++;
        }
        else if(Character.isWhitespace(ch)){
            spaces++;
        }
        }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants :" + consonants);
    System.out.println("Digits:"+ digits);
    System.out.println("Spaces:"+ spaces);
    
}
}
