//used brute force approach (used nested loops and flags). Time complexity: 0(n^2)
//This code can also be done using HashMap , as it takes 0(n) , I've saved that one in the Hashing Folder
public class FrequencyOfElements{
    public static void main(String[] args){

        int [] arr = {5,6,10,12,10,5,5,9};

        int n = arr.length;

        System.out.println("Element | Frequency");

        for(int i = 0; i<n;i++){
            boolean alreadyCounted = false;
        
    //check whther arr[i] was already printed before or noted before in the list}

    for(int k=0; k<i; k++){
        if(arr[i] == arr[k]){
            alreadyCounted = true;
            break;                       //we skip if the element is already noticed or already present in the list of out
        }
    }
        if(alreadyCounted)
        continue;

        int count= 1;                   //count current element once
        
        //to check if the number occurs again if future , and increase the count 

        for(int j=i+1; j<n;j++){
            if(arr[i]==arr[j]) {
                count ++;
            }
        }
        System.out.println(" " + arr[i] + " | "+count );
    }
}
}