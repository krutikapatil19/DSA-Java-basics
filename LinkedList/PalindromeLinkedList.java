//Node class
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    //Function to check if linked list is palindrome
    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null) return true;

        //Find middle
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);

        //Comparing both halves
        Node firstHalf = head;
        while(secondHalf != null) {
            if(firstHalf.data != secondHalf.data) {
                return false;                                  //when both halves mismatch , linkedlist is not palindrome.
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;                                           //all matched
    }

    //Helper function to reverse linked list 
    private static Node reverse(Node head) {
        Node prev = null, curr = head, next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //Main to test
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

       if (isPalindrome(head)) {
        System.out.println("It's a Palindrome Linked list");
       } else {
        System.out.println("Not a Palindrome");
       }
    }
    
}
