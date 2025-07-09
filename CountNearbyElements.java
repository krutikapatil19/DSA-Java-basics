public class CountNearbyElements {
    public static int findCount(int[] arr, int num, int diff) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num - diff && arr[i] <= num + diff) {         //Check if arr[i] lies between [num - diff, num + diff]
                count++;
            }
        }

        if (count == 0) {
            return -1;                                                  // If no element was nearby, return -1
        }

        return count;
    }
    public static void main(String[ ] args){
        int [ ] arr= {3,15,7,9,8};
        int num =13;
        int diff=2;
        int result = findCount(arr, num, diff);

        System.out.println("Count of nearby elements :" + result);
    }
}
