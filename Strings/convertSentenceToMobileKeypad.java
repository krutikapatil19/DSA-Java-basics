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

        StringBuilder output = new StringBuilder();

        for(char ch : input.toCharArray()) {
            if (ch == ' ') {
                output.append("0"); //space becomes 0
            } else {
                int index = ch - 'A';   //find position
                output.append(map[index]);
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        String input = "HELLO WORLD";
        System.out.println(printSequence(input));
    }
}
