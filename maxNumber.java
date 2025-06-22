public class maxNumber{
    public static void main(String[] args){
        int[] arr= {2,5,8,9,4};

        int max=arr[0];
        for(int i =0;i<arr.length;i++)
        if(arr[i]>max)
        max=arr[i];
        System.out.println("The maximum number is :"  + max);

    }
}