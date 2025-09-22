public class secondLargest {
    public static int secondLargeValue(int[] arr){

        int firstLargest = 0;
        int secondLargest = Integer.MIN_VALUE;                  

        for(int i =1; i<arr.length; i++){                           //iterating through the array  
            if(arr[i]>firstLargest){                                //comparing the ith element with firstLargest , if its greater ,then update firstLargest.
                firstLargest = arr[i];
            }else if 
            (arr[i]>secondLargest && arr[i]<firstLargest){          //if the element is greater than secondLargest ,but lesser than firstLargest (i.e between firstLargest & secondLargest) , then update secondLargest.
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[]args){
        int[] arr = {3,5,29,20,30,15};

        //secondLargest obj = new secondLargest();
        int secondLargest = secondLargeValue(arr);
        System.out.println("The second Largest element is : " + secondLargest);
    }
}