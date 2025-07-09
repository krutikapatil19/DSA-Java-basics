import java.util.HashSet;
public class checkDuplicate {
    public static void main(String[] args){

        int [] arr = {3,7,5,10,20,6};

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;               //we consider the array hasDuplicate as false , as initially there is no duplicates

        for(int num : arr){                     //number belonging to the array 
            if (set.contains(num)) {            //to check whether the set contains that number
                hasDuplicate = true;            //this means the number is duplicate , so it breaks the loop 
                break;
            }
            set.add(num);                       //to add the number if it is unique/ notduplicate
        }

        if(hasDuplicate){
            System.out.println("The array contains Duplicates");
        }else{
            System.out.println("The array does not contain any duplicates ");
        }


    }
    
}
