public class LargestConcatenation {
    public static String largestConcatenatedNumber(int[] arr){
        if(arr==null && arr.length==0) return "";

        String[] strNums = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a,b) -> (b+a))
    }
}
