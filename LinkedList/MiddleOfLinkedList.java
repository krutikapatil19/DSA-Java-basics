class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {this.val = val;}
}

public class MiddleOfLinkedList {
    public static ListNode middleNode (ListNode head ){
        ListNode slow = head, fast = head;

        while(fast != null && fast.next!= null ) {
            slow = slow.next;                                   //move one step
            fast = fast.next.next;                              //move 2 steps
        }
        return slow;                                            //slow is at the middle 
    }

    //Function to insert a new node at the end 
    public static ListNode insertEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) return newNode;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = null;                                  //declare only once
        head = insertEnd(head , 10);
        head = insertEnd(head, 12);
        head = insertEnd(head, 14);
        head = insertEnd(head,19);
        head = insertEnd(head,22);
        head = insertEnd(head, 30);

        ListNode mid = middleNode(head);
        System.out.println("Middle Node = " + mid.val);

    }
    
}
