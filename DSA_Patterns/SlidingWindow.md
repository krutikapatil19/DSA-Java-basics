# Sliding Window Technique

A problem-solving method in which we use a window (contiguous block of elements) that moves (slides) over an array or string to perform calculations efficiently . 
Instead of recalculating for every window , we use previous results by adding the new element and removing the old one. 

- Time complexity improves from O(n*k) to O(n).
- Works best when the problem involves contigious subarrays or substrings.

## Two types of Sliding Window 

### 1. Fixed Sized Window
In this window length is fixed. 
- Ex: Finding the maximum sum of any 3 consecutive days sales. You dont recalculate all 3 each time , you just drop the old day and add the new day.

- Ex: Find max sum of subarray of size 3 in [2,1,5,1,3,2]
- -> First window - (2+1+5) = 8
- -> Slide -> Remove 2, Add 1 - sum = 7
- -> Slide -> Remove 1, Add 3 - sum = 9
- -> Slide -> Remove 5, Add 2 - sum = 6
- Ans = 9

### 2 . Variable-size window 
In this, window expands or shrinks depending on conditions.
- Ex: Finding the smallest substring that contains all characters of another string. You grow/shrink the window until the condition is satisfied.


