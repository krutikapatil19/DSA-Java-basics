import java.util.Arrays;
public class anagram {
    public static void main(String[] args){
        String str1= "silent";
        String str2= "listen";

        //convert both strings to lowercase and char arrays

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        //sort both arrays

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }


    }
    
}
