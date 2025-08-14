package LinkedList;

class Node{                                                             //we defined what a node in a linked list looks like 
    int val;                                                            //the number/value stored in the box.
    Node next;                                                          //A pointer to the next box. If there's no box , then its null.
    Node(int val) {this.val = val;}                                     //Constructore , when a new node is created , it saves the value .
}

public class ReverseLinkedList {

    //print linked list
    static void printList(Node head) {                                  //static is used , so that we can call it directly from main , without maiking an object.  //printList(Node head) = when we give the first node , it will print it.
        for (Node temp = head; temp != null; temp = temp.next)
        System.out.print(temp.val + " -> ");
        System.out.println("null");
    }

    //Insert at end
    static Node insertEnd(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        while (temp .next != null) temp = temp.next;
        temp.next = new Node(val);
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head, 1);
        head = insertEnd(head, 2);
        head = insertEnd(head, 3);
        head = insertEnd(head, 4);

        printList(head);
    }
}
