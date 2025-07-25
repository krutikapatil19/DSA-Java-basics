 //Find the number of substrings where the count of vowels and consonants are equal, and their product is divisible by a given number
 public class HarmoniousSegments {
    public static int countHarmoniousSegments(String[] input) {
        String s = input[0];
        int k = Integer.parseInt(input[1]);
        int count = 0;

        for(int i = 0; i<s.length(); i++) {                                                 //outer for loop  //chooses the start of the substring 
            int vowels = 0, consonants = 0;

            for(int j = i; j<s.length(); j++) {                                             //inner for loop  //check all end points from i 
                char ch = s.charAt(j);
                if (isVowel(ch)) vowels++;
                else consonants++;


                if(vowels == consonants && (vowels*consonants) % k == 0){                       //if the number of vowels and consonants are equal ,and (vowels*consonants) is divisible by the given number "k", then add that substring and increase count.
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        System.out.println(countHarmoniousSegments(new String[]{"baeyh", "2"}));
        System.out.println(countHarmoniousSegments(new String[]{"bcdf", "1"}));
    }
}