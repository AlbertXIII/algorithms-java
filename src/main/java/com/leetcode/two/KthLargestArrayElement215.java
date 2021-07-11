package com.leetcode.two;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestArrayElement215 {

	public static void main(String[] args) {
		System.out.println(findKthLargestK(new int[] {3,2,1,5,6,4}, 2));
	}
	
	public static int findKthLargestK(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num: nums){
            minHeap.add(num);
            if(minHeap.size() > k) minHeap.remove();
        }
        return minHeap.poll();
    }
	
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
