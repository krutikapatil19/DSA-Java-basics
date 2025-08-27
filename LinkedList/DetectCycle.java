class Node {
int val;
Node next;
Node(int val) {
    this.val = val;
    this.next = null;
    }
}

public class DetectCycle {
    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    
public static void main(String[] args){
    //Create nodes
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(6);
    Node n4 = new Node(20);
    Node n5 = new Node(12);


    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    //Check cycle
    if (hasCycle(n1))
    System.out.println("Cycle exists");
    else 
    System.out.println("No cycle");
}
}
