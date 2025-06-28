public class FrequencyCount {
    public static void main(String[] args){
        String str = "Krutika".toLowerCase();           //converted to lowercase 
        int[] freq = new int[256];                      //ASCII 256 possibilities

        for(int i = 0 ; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        System.out.println("The Frequencies of character is:" );

            for (int i = 0; i<256 ;i++){
                if(freq[i]>0){
                    System.out.println((char)i + " =" + freq[i]);           //(char) i  converts the ASCII code to its character equivalent
                }
            }
        }
    }
    

