public class FindMissingNumber {
public static void main(String[] args){
int[] arr = {5,4,10,2,6};

int n=6;                            //no. of elements in the array //we need to tell the program how many numbers we expect 
int total = n * (n+1)/2;            //formula for sum of n natural numbers

int sum = 0;
for(int i =0; i<arr.length;i++){    //this loop calculates the sum of all elements in the array 
sum += arr[i];                      //adds sum after traversing through each element 
}

int missing = total - sum;          //formula to find the missing number //missing = 21-27
System.out.println("Missing number is:" + missing);

}
}
