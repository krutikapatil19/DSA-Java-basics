class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveCycle {
    
    // Function to detect and remove cycle
    public static void removeCycle(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head, fast = head;

        // Step 1: Detect cycle
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {         // cycle detected
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return; // No cycle → nothing to remove

        // Step 2: Find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        // Now slow (or fast) is at the start of the cycle

        // Step 3: Find the last node of cycle and break it
        ListNode temp = slow;
        while (temp.next != slow) {
            temp = temp.next;
        }
        temp.next = null; // breaks the cycle
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a cycle: connect 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Detect & remove cycle
        removeCycle(head);

        // Print list after removing cycle
        System.out.println("Linked List after removing cycle:");
        printList(head);
    }
}
