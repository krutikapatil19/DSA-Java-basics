public class RemoveDuplicatesInPlace {
    public static int RemoveDuplicatesInPlace(int[ ] nums){

        if(nums.length ==0)return 0;                        //if the array is empty , return 0

        int i =0;                                           //i represents the latest unique element
        for(int j =1; j<nums.length;j++){                   //start from the second element and scan the array 
            if(nums[j]!=nums[i]){                           //if the current element is not equal to the latest unique one , then move it forward
                i++;
            
            nums[i] = nums[j];                              //place the unique element at index i 
            }
        }
        return i +1;                                        //return the count of unique elements
    }
        public static void main(String[ ] args){
            int[ ] nums={8,10,10,9,2,2};

            java.util.Arrays.sort(nums);                    //sorting the array before using the function
            int uniqueCount = RemoveDuplicatesInPlace(nums);
            System.out.println("The array having the unique elements is:");
            for(int i =0;i<uniqueCount;i++){
                System.out.print(nums[i] + " ");
            }
        }
    }
        
    
