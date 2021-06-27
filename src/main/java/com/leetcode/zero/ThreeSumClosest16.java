package com.leetcode.zero;

import java.util.Arrays;

public class ThreeSumClosest16 {

	public static void main(String[] args) {
		System.out.println(threeSumClosest(new int[] {-1,2,1,-4}, 3));
	}
	
	public static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int pointer1 = i + 1, pointer2 = nums.length - 1;
            
            while(pointer1 < pointer2){
                int sum = nums[i] + nums[pointer1] + nums[pointer2];
                if(sum > target) pointer2--;
                else pointer1++;
                if(Math.abs(sum - target) < Math.abs(result - target)) 
                    result = sum;
            }
        }
        return result;
    }

}
