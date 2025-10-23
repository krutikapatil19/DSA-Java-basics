public class ProductExceptSelf{
    public static int[] product(int[] nums){
        int n = nums.length;
        int []LP = new int[n];          //left products
        int []RP = new int[n];          //right products
        int[] answer = new int[n];
        
        //left product array 
        LP[0] = 1;              //nothing is to the left of first element
        for (int i = 1; i<n; i++) {
            LP[i] = LP[i-1]*nums[i-1];
        }
        //right product array
        RP[n-1] = 1;//nothing to the right of last element
        for(int i = n-2; i>=0;i--){
        RP[i] = RP[i+1] * nums[i+1];
        }

        //Multiply left and right products
        for(int i = 0; i<n; i++){
            answer[i] = LP[i] *RP[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = product(nums);

        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}