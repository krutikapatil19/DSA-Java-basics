//Node class
class Node {
    int data;                               //value of the node
    Node next;                              //reference to the next node in the list

    Node(int data) {
        this.data = data;                   //assign data to the current node
        this.next = null;                   //assume there is no next node , means when we create new node , then the value gets assigned 
    }
}

//Linked List class
public class LinkedListBasics {
    Node head;

    //Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);      //create a new node

        if (head == null) {                 //if the list is empty , new node becomes head
            head = newNode;                 
            return;
        }

        Node temp = head;                   //if linkedlist is not empty , start from head 
        while (temp.next != null) {         //traverse till end, the next node we get as null
            temp = temp.next;
        }
        temp.next = newNode;                //for inserting new node at the last , we first find the last node (we find it by checking if the next node is null) , then we assign the new node to next
    }


    //Print LinkedList
    public void display() {
        Node temp = head;                  //we assign head to temp , for traversal from head to tail
        while(temp != null) {              //traverse until temp is not null
            System.out.print(temp.data + " -> ");
            temp = temp.next;              //after printng the current node data , move temp to the next node
        }
        System.out.println("null");
    }

    //Main function
    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}