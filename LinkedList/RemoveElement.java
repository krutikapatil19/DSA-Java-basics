class ListNode {
    int val;
    ListNode next;

    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveElement {
    //fucntion to remove the target element
    public static ListNode removeElements (ListNode head, int target) {
        //Create dummy node before head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = dummy;

        //Traverse list
        while(current.next != null) {
            if(current.next.val == target) {
                //Skip the node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;                                  //new head
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode (4);


        int target = 6;

        //Remove target elements
        ListNode result = removeElements(head, target);

        //Print updated list
        while(result!= null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    }
    
    
