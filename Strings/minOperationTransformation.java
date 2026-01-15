import java.util.HashMap;
public class MinOperationTransformation {
    public static int minOperations(String A, String B) {

        //If lengths are different -> return -1
        if (A.length() != B.length()){
            return -1;
        }

        //2.// Step 2: Check if A and B contain the same characters with same frequency

        HashMap<Character, Integer> map = new HashMap<>();
         for(int i = 0;i<A.length(); i++){
            char ch = A.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);           //If char exists , increase count 
            } else {
                map.put(ch, 1);                         //else add with 1
            }
         }
         //Reducing characters of B 
         for(int i = 0; i<B.length(); i++){
            char ch = B.charAt(i);

            if(!map.containsKey(ch)){
                return -1;
            } else {
                map.put(ch, map.get(ch) - 1);
            }
         }

         for(int val : map.values()) {
            if(val != 0) {
                return -1;
            }
         }


         //3.Initializing pointers from END of both strings
         int i = A.length() - 1;
         int j = B.length() - 1;

         int count = 0; //number of operations

         //4.Traverse Strings from right to left
         //Match characters from the end; if mismatch occurs, move characters in A to front.
         
         while(i >= 0 && j>= 0) {
            
            if (A.charAt(i) == B.charAt(j)){
            //If characters match: move both pointers left
            i--;
            j--;
         } else {
            //increment count
            count ++;
            //move only pointer i left
            i--;
         }
    }
    return count;
}
    public static void main(String[] args){
        String A = "EACBD";
        String B = "EABCD";

        System.out.println(minOperations(A,B));
    }
}
