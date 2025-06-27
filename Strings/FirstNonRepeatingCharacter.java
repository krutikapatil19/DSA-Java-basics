public class FirstNonRepeatingCharacter {
    public static void main(String[] args){

    String str = "KrutikaPatil".toLowerCase();

    int[] freq = new int[256];     //array to count frequency of characters using ASCII, 256 slots as there are 256 ASCII characters
    
        //step1:count frequencies
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);        //pointer used to point at current element or character
            freq[ch]++;                     //increases count at that index
            
    }

    //find first non-repeating character

    boolean found = false; //flag to check if we found one 

    for(int i =0;i<str.length();i++){
        char ch = str.charAt(i);
        if (freq[ch] == 1) {
            System.out.println("First non repeating character is :" + ch);
            found = true;
            break;
        }
    }
            if(!found){
                System.out.println("No non-repeating character found");
        }
    }
}
    


    
    
    

