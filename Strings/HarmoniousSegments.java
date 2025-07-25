 //Find the number of substrings where the count of vowels and consonants are equal, and their product is divisible by a given number
 public class HarmoniousSegments {
    public static int countHarmoniousSegments(String[] input) {
        String s = input[0];
        int k = Integer.parseInt(input[1]);                                     //The number to check divisibility with
        int count = 0;                                                          //To count how many harmonious segments we find

        //Loop through every starting point of the substring
        for(int i =0; i< s.length(); i++){
            int melodic = 0 , rhythmic = 0;                                     //Start with 0 melodic & rhythmic notes


            for(int j = i; j<s.length(); j ++){                                //Loop through every ending point from i to end of string
                char ch = s.charAt(j);
                if("aeiou".indexOf(ch) >= 0)melodic++;                         //check if its a vowel
                else rhythmic++;

                if(melodic == rhythmic && (melodic*rhythmic) % k == 0)
                count++;
            }
        }
        return count;                                                         //return the total harmonious segments
    }

    public static void main(String[] args){
        System.out.println(countHarmoniousSegments(new String[] {"baeyh", "2"}));
        System.out.println(countHarmoniousSegments(new String[] {"bcdf", "1"}));   
    }
    
}
