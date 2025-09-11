# Sliding Window Technique

A problem-solving method in which we use a window (contiguous block of elements) that moves (slides) over an array or string to perform calculations efficiently . 
Instead of recalculating for every window , we use previous results by adding the new element and removing the old one. 

- Time complexity improves from O(n*k) to O(n).
- Works best when the problem involves contigious subarrays or substrings.

## Two types of Sliding Window 

### 1. Fixed Sized Window
In this window length is fixed. 
- Ex: Finding the maximum sum of any 3 consecutive days sales. You dont recalculate all 3 each time , you just drop the old day and add the new day.

### 2 . Variable-size window 
In this, window expands or shrinks depending on conditions.
- Ex: Finding the smallest substring that contains all characters of another string. You grow/shrink the window until the condition is satisfied.
