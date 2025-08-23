// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
public class LinkedListBasics {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {   // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {  // move till last
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main function
    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}
