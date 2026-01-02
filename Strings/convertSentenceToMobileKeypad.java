public class convertSentenceToMobileKeypad {
    public static String printSequence(String input) {

        //Keypad mapping for A-Z
        String[] map = {
            "2","22","222", //A,B,C
            "3","33","333", //D,E,F
            "4","44","444", //G,H,I
            "5","55","555", //J,K,L
            "6","66","666", //M,N,O
            "7","77","777","7777",  //P,Q,R,S
            "8","88","888", //T,U,V
            "9","99","999","9999"   //W,X,Y,Z
        };

        StringBuilder output = new StringBuilder(); //Stringbuilder is fast and efficient in linear time.(As String is immutable in Java, so repeated concatenation is inefficient)

        for(char ch : input.toCharArray()) {
            if (ch == ' ') {
                output.append("0"); //space becomes 0
            } else {
                int index = ch - 'A';   //find position
                output.append(map[index]);//Use index to fetch keypad number from map , and append it to the output.
            }
        }
        return output.toString();   //Convert StringBuilder to String 
    }
    public static void main(String[] args) {
        String input = "HELLO WORLD";
        System.out.println(printSequence(input));
    }
}
