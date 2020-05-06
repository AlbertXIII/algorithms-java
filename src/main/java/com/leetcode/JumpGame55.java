package com.leetcode;

public class JumpGame55 {

	public static void main(String[] args) {
		System.out.println(canJump(new int[]{2,3,1,1,4}));
	}
	
	static public boolean canJump(int[] nums) {
        if(nums == null) return false;
        int lastGood = nums.length - 1;
        for (int i = lastGood; i >= 0; i--){
            if(i + nums[i] >= lastGood) lastGood = i;
            System.out.println(i + " nums[i]: " + nums[i]+ " last Good " + lastGood);
        }
        return lastGood == 0;
    }

}
