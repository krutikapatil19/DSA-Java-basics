class Node{
    int val;
    Node next;
    Node (int val) {this.val = val;}
}

public class MergedSortedLinkedList {

    //Function to merge two sorted lists
    public static Node mergeTwoLists(Node list1 , Node list2) {
    Node dummy = new Node(-1);
    Node tail = dummy;

    //comparing while both lists exist 
    while (list1 != null && list2 != null){
        if(list1.val <= list2.val){
        tail.next = list1;
        list1 = list1.next;                     //move list1 forward
    } else {
        tail.next = list2;
        list2= list2.next;                      //move list2 forward
    }
    tail = tail.next;                           //move tail forward
    }

    //Attach the leftover list
    if (list1 != null)tail.next = list1;
    if (list2 != null)tail.next = list2;
    return dummy.next;
}

//Helper function to insert at end
public static Node insertEnd(Node head, int val) {
    Node newNode = new Node(val);
    if (head == null) {
        return newNode;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
    return head;
    }

    //helper function to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

public static void main(String[] args){
   Node list1 = null;                       //First sorted list
   list1 = insertEnd(list1, 10);
   list1 = insertEnd(list1, 12);
   list1 = insertEnd(list1, 16);

   Node list2 = null;
   list2 = insertEnd(list2, 5);
   list2 = insertEnd(list2, 6);
   list2 = insertEnd(list2, 9);


   System.out.println("list1: ");
   printList(list1);

   System.out.print("list 2: ");
   printList(list2);

   //Merge them
   Node merged = mergeTwoLists(list1, list2);

   System.out.print("Merged List: ");
   printList(merged);
}
}
