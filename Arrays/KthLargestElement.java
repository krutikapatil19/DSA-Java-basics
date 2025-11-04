//#Leetcode 215 : Find the Kth largest element in an array
//I've used the Min-heap Approach, min-heap(priority queue) always keeps k largest elements seen so far

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Step1 : Create a min-heap of size k
        // Add elements from the array one by one
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

        // Step2: If heap size becomes more than k , then remove the smallest one
        if (pq.size() > k) {
            pq.poll();
            }
        }
        // Step3 : At the end , the top of the heap will be the K-th largest element.
        int kLargest = pq.peek();
        return kLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(arr, k));
    }
}
/*
 * Time Complexity: O(n log k)
 * Space Complexity : 0(k)
 */