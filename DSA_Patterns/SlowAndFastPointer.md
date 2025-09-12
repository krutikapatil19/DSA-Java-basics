# Fast and Slow Pointer concept

Its mostly used in LinkedLists (and sometimes arrays) to solve problems like finding a cycle , finding the middle of a list, or detecting repetition.

## Uses

- Detecting cycle in a linked list
- Finding the middle element of a linked list

# 🐢🐇 Fast & Slow Pointer (Floyd’s Cycle Detection)

## 🌟 Concept
The **Fast & Slow Pointer** technique (also called Floyd’s Tortoise and Hare Algorithm) is used to solve problems where two pointers move at **different speeds** through a data structure.

- **Slow Pointer (🐢)** → moves **1 step** at a time  
- **Fast Pointer (🐇)** → moves **2 steps** at a time  

👉 If there is a **cycle** → they will eventually meet.  
👉 If the path is **straight** → fast pointer will reach the end, and they will never meet.

---

## ✅ Common Use Cases
1. Detecting **cycle in a linked list**  
2. Finding the **middle element** of a linked list  
3. Detecting cycles in **numbers/sequences** (like Happy Number problem)

---

## 📝 Example 1: Detect Cycle in Linked List

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleCheck {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;   // 🐢
        ListNode fast = head;   // 🐇

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {        // 💡 met inside cycle
                return true;
            }
        }
        return false; // reached end → no cycle
    }
}
