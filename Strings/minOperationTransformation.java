import java.util.HashMap;
public class minOperationTransformation {
    public static int minOperations(String A, String B) {

        //If lengths are different -> return -1
        if (A.length() != B.length()){
            return -1;
        }

        //2.Checking if A and B have same characters (frequency check)
         //i have doubt in writing this , i will try
         HashMap<Character, Integer> map = new HashMap<>();
         for(int i = 0;i<A.length(); i++){
            char ch = A.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);           //If char exists , increase count 
            } else {
                map.put(ch, 1);                         //else add with 1
            }
         }


         //3.Initializing pointers from END of both strings
         int i = A.length() - 1;
         int j = B.length() - 1;

         int count = 0; //number of operations

         //4.Traverse Strings from right to left
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
