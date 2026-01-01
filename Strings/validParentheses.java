import java.util.Stack;

public class validParentheses{
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            //If opening , push to stack
            if (c == '(' || c =='{' || c =='[') {
                stack.push(c);
            }else {
                //If closing but no opening to match 
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                //Check matching pairs
                if(c ==')' && top !='(') return false;
                if(c =='}' && top != '{') return false;
                if(c ==']' && top != '[') return false;
            }
        }

        //True only if no unclosed brackets left
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "[({()})]";
        System.out.println(isValid(s));
    }
}

//We use a stack to store opening brackets and ensure each closing bracket matches the most recent opening one.
/*Time & Space Complexity
Time: O(n)
Space: O(n) (stack)
*/