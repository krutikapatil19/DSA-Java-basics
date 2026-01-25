import java.util.HashMap;
public class FirstNonRepeatingNumber {
    public static int firstNonRepeatingNumber(int[] arr){
        int answer = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int x = arr[i];
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i= 0;i<arr.length;i++){
            if(map.get(arr[i]) == 1){
                answer= arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {2,6,5,8,8,2,6};
        System.out.println(firstNonRepeatingNumber(arr));
    }
}
