//To find the minimum number of houses needed to collect food to feed each rat , given: food per house and food needed by each rat(unit)
public class RatsAndFood {
    public static int food(int r, int unit, int[] arr){
        if(arr == null) return -1;                      //if the input array is null , there's no food, return -1

        int totalFoodNeeded = r * unit;                 //calculates total food required to feed all rats
        int foodCollected = 0;

        for(int i =0; i<arr.length; i++){
            foodCollected += arr[i];                    //adds food present in the current house

            if(foodCollected >= totalFoodNeeded){
                return i+1;                             //if food collected is equal or more than totalFoodNeeded, ie its sufficient , then return number of houses visited(i+1)
            }
        }
        return 0;                                       //not enough food
    }

    public static void main(String[] args){
        int r=7;
        int unit =2;
        int[] arr={3,5,7,8,9};

        int result = food(r, unit, arr);                //in this we call the method and store result
        System.out.println("Minimum houses needed:" + result);
    }
    
}
