public class RabinKarpAlgorithm {
    public static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int base = 256;
        int mod = 101;

        int pHash = 0;
        int tHash = 0;
        int h = 1;

        //Calculate h
        for(int i = 0; i< m-1; i++){
            h = (h*base) % mod;
        }

        //Calculate initial hash for pattern and first window of text
        for(int i = 0; i< m; i++){
            pHash = (base * pHash + pattern.charAt(i)) % mod;
            tHash = (base * tHash + text.charAt(i)) % mod;
        }

        //Slide pattern
        for(int i = 0; i<= n-m; i++) {
            //If hash values match, check characters one by one
            if (pHash == tHash) {
                boolean match = true;

                for(int j = 0; j<m; j++) {
                    if (text.charAt(i+j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if(match) {
                    System.out.println("Pattern found at index" + i);
                }
            }
            //Calculate hash for next window
            if (i < n - m) {
                tHash = (base* (tHash - text.charAt(i)* h) + text.charAt(i+m)) % mod;

                //Make hash positive
                if (tHash < 0) {
                    tHash += mod;
                }
            }
        }
    }
    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String pattern = "GEEK";

        search(text, pattern);
    }
}
