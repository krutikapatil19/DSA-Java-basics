//I already did Kadane's logic code in the java file name MaxSubarraySum , this one conatins the edge cases of Kadane's Algorihtm 
//This one contains : Handling for all-zero arrays , Handling for all-negative arrays , logic to print the actual subarray (start to end index)

public class KadanesEdgeCases {
    public static void main(String[] args){
        int[] arr ={-5,-6,-1,-2};                     //Try different edge cases here 
                     
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;              //initializing maxSum as minimum value

        boolean allZero = true;                     //we asssume the allZero and allNegative as true unless proven false
        boolean allNegative = true;

        int start=0 , tempStart = 0, end = 0;

        for(int i=0; i < arr.length ; i++){
            
            if(arr[i] != 0){                        //if we found an elemenet which is !0 , then boolean allZero becomes false
                allZero = false;
            }

            if(arr[i] >= 0){                        //if an element > 0 , then boolean allNegative becomes false
                allNegative = false;
            }

            currSum += arr[i];                      //currSum keeps track of the current element addition 

            if(currSum > maxSum){                   //when currSum>maxSum , then maxSum is updated to currSum
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if(currSum<0){                          //if currSum < 0 , then its set to 0
                currSum = 0;
                tempStart = i+1;
            }
    }

    if(allZero){
        System.out.println("The array contains allZero elements");            //prints when allZero is true as we stated initially , means it was true only , and not proven false
        System.out.println("Maximum Subarray Sum is: 0");                     //the max is  always 0 , when all elements are 0 
    }

    else if(allNegative){
        //Find the max element (least negative) , ex. -1,-2,-3 , output should be -1
        int max = arr[0];                                                       //we set the max to element which is at 0th index
        int index = 0;                                                          //we state the index as 0 .and then below , we traversed through the array and checked whether we found an element which is greater than that element which is at arr[0], so we traversed from arr[i]
        for(int i =1; i <arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        System.out.println("The array contains all Negative elements");      //we print 2 things: array contains allNegative elements , Maxsubarray sum 
        System.out.println("Maximum Subarray sum is :" + max);
        
    }
    else{
        System.out.println("The maximum Subarray sum is:" + maxSum);
        System.out.print("Subarray : ");
        for(int i =start;i<=end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
}

