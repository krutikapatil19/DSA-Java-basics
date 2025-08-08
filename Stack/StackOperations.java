package Stack;

public class StackOperations {
   int max = 100;
   int[] stack = new int[max];
   int top = -1;

   //Push operation
   void push(int value) {
    if(top >= max - 1) {
        System.out.println(" Stack overflow");
    }else  {
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }
   }

   //Pop operation
   int pop() {
    if(top < 0) {
        System.out.println(" Stack underflow");
        return -1;
    } else {
        int popped = stack[top];
        top --;
        System.out.println(popped + " popped from stack ");
        return popped;
    }
   }
   void display() {
    if(top < 0) {
        System.out.println("Stack is empty");
    } else {
        System.out.print("Stack elements :");
        for(int i =0; i<= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
   }
   public static void main(String[] args) {
    StackOperations s = new StackOperations();

    s.push(10);
    s.push(20);
    s.push(30);
    s.display();

    s.pop();
    s.display();
   }
}
