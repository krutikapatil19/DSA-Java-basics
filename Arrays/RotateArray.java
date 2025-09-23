//to rotate the array to left by 1 
public class RotateArray{
    public static void main(String []args){

        int [] arr ={10,290,35,78,25};

        int temp= arr[0];

        int i;
        
        for(i=0;i<arr.length-1 ;i++){

            arr[i]=arr[i+1]; 
        }

        //putting 1st element to the last index

        arr[arr.length-1] = temp;
        System.out.println("The rotated array is :");
        for (int value : arr){
        System.out.print(value + " ");
        }
    }
}

//Rotation of array using an extra array , temp. This approach is easy to understand , but not optimized version . Rotation using reverse algorithm is a more optimized way to solve the same problem .