public class RemoveDuplicates {
    public static void main(String [] args){
        int [] arr = {5, 6, 6, 9, 9, 10, 15,15, 30 };

        System.out.println("The Array after removing duplicates is :");
        System.out.print(arr[0] + " ");
        
        for(int i =1; i<arr.length; i++){
            if (arr[i]!= arr[i-1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
