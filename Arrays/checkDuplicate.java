import java.util.HashSet;
public class checkDuplicate {
    public static boolean hasDuplicates(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<arr.length; i++){
            if(set.contains(arr[i])) {
                return true;                            //If the number is already present in the array , it means the array contains duplicates.
            }
            set.add(arr[i]);                            //to add the number if it's not already present.
    }
    return false;
    }

        public static void main(String[] args){
            int[] arr = {3,7,5,10,20,20,6};

            boolean checkDuplicate = hasDuplicates(arr);

            if(checkDuplicate) {
                System.out.println("The array contains duplicates.");
            }else {
                System.out.println("The array does not contain any duplicates.");
            }
        }
    }

    
    
