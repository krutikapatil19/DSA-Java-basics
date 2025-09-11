# Two Pointer Technique
The two pointer technique is a problem-solving approach where we use two variables (pointers) to traverse data structures (like arrays or strings) from different directions (start & end, or with different speeds) to solve problems efficiently.

## Types of Two Pointer Approaches

### 1. Opposite Ends
- Start one pointer at the beginning, one at the end, and move inward.  
- **Example:** Checking if a string is a palindrome.

```java
boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
}
```

#### 2.Same Direction: 
Both pointers start from the beginning, but move at different speeds (slow & fast).
Example: detecting cycle in a linked list.

### Types of Problems which can be solved by Two Pointers Approach
-Pair-Sum problem
-Remove duplicates from Sorted array
-Move zeroes to the end
-Palindrome String / Valid Palindrome (ignoring spaces, case)
-Container with most water (leetcode #11)


#### Conclusion: 
Two pointer technique optimizes problems involving arrays or strings by using two indices that move towards each other or in the same direction. It reduces time complexity from O(n²) to O(n) in many cases.





