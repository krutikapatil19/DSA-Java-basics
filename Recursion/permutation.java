public class permutation {
    public static void permute(String str, int left , int right){
        //base case
        if (left == right){
            System.out.println(str);
        }
        for (int i = left; i<=right; i++){
            str = swap(str, left, i);                   //swap         //It basically swaps the character at left with the character at i.
            permute(str, left+1, right);                //recurse      //move each possible character to try all possibilities.
            str = swap(str,left,i);                     //backtrack    //Swap is used to move each character to the first place.
        }
    }

//helper function to swap characters in a string
public static String swap(String str, int i, int j){
    char[]ch = str.toCharArray();
    char temp = ch[i];
    ch[i] = ch[j];
    ch[j] = temp;
    return new String(ch);
} 

public static void main(String[] args) {
    String str = "abc";
    permute(str,0, str.length()-1);
}
}