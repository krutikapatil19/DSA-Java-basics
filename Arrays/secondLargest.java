public class secondLargest {
    public static void main (String[] args){

        int[]arr = {3,8,5,10,12,9};

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    secondMax=max;
                    max=arr[i];

                }else if (arr[i]>secondMax && arr[i] !=max){
                        secondMax = arr[i];
                    }

                }
                System.out.println("The second Largest Element is: "+secondMax);

        }
    }

