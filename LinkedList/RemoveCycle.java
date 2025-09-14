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
        // Now slow or (fast) is at the start of the cycle

        // Step 3: Find the last node of cycle and break it
        ListNode temp = slow;
        while (temp.next != slow) {
            temp = temp.next;
        }
        temp.next = null; // breaks the cycle
    }
}
