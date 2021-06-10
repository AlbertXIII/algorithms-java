package com.leetcode.three;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArrays349 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersectionK(new int[] {1,2,2,1}, new int[] {2,2})));
	}
	
	private static int[] intersectionK(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num))  intersection.add(num);
        }
        int[] res = new int[intersection.size()];
        int indx = 0;
        for(int i : intersection){
            res[indx++] = i;
        }
        return res;
    }

}
