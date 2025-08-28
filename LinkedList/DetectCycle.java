class Node {
int val;                                            //value inside the node
Node next;                                          //reference to the next node
Node(int val) {
    this.val = val;                                 //put value in the node
    this.next = null;                               
    }
}

public class DetectCycle {
    //Function to check if cycle is present
    public static boolean hasCycle(Node head) {
        Node slow = head,                           //slow pointer -> moves 1 step
        fast = head;                                //fast pointer -> moves 2 steps
        while(fast!= null && fast.next!= null){     //keep moving till fast reaches end
            slow = slow.next;                       //move slow 1 step
            fast = fast.next.next;                  //move fast 2 steps
            if(slow == fast) return true;           //if both meet -> cycle
        }
        return false;                               //if fast reaches null -> no cycle
    }
    
public static void main(String[] args){
    //Create nodes
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(6);
    Node n4 = new Node(20);
    Node n5 = new Node(12);

    //connecting the nodes : 1 -> 2 -> 3 -> 4 -> 5
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
