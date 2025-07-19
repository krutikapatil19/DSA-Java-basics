    import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args){
        String str1= "silent";
        String str2= "listen";

        //convert both strings to lowercase and char arrays

        char[] arr1 = str1.toLowerCase().toCharArray();         //converted to char , as string dont support sorting support , and are immutable , sorting is done to compare in easy way
        char[] arr2 = str2.toLowerCase().toCharArray();         //lowercase is done for all letters , as java identifies Mand m as different

        //sort both arrays

        Arrays.sort(arr1);                          //sorting is done to arrange the elements in a order  to check if the strings are equal
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }


    }
    
}

    

