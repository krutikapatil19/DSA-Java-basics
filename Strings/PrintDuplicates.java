
public class PrintDuplicates {
    public static String printDuplicates(String s){
        if (s == null || s.isEmpty()) {
            return "No duplicates";
        }
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder result = new StringBuilder();
        boolean found = false;

        for(int i = 0; i<freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println(" ' " + (char)i + " ' ->" + freq[i]);
                found = true;
            }
        }
        if (!found) {
            return "No duplicates found.";
    }
    return result.toString();
}

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(printDuplicates(s));
    }
}