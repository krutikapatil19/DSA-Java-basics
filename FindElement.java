public class FindElement {
    public static void main(String [] args){
        
        int[]arr = {5,7,8,10,9,6};
        int x=9;

        boolean found = false;

        for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
                
                System.out.println("The element is found at :" + i);
                found= true;
                break;
         }
        }
        if (!found ){
        System.out.println("Element not found !");

    }

}
    
}
