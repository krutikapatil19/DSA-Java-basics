//Print all elements from the array such that no greater element appears to their right 
public class LeaderElements {
    public static void main(String[] args){
        int[] arr= {3,6,9,14,13,6};
        int n = arr.length;

        int maxFromRight =arr[n-1];             //assuming last element as maxFromRight , as there is nothing to the next of it 
        System.out.print("Leader Elements are :" + maxFromRight + " ");

        for(int i =n-2; i>=0; i--){             //checking from last second element , i.e n-2
            if(arr[i] >= maxFromRight){         //check whether it is greater than or equal to maxFromRight
            maxFromRight = arr[i];              //if it is , then update maxFromRight
            System.out.println(maxFromRight + " ");
            }
        }
    }
    
}
