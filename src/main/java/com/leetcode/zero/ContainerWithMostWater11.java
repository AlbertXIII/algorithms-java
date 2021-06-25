package com.leetcode.zero;

public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		System.out.println(maxAreaN(new int[] {1,8,6,2,5,4,8,3,7}));
	}
	
	private static int maxAreaN(int[] height) {
		int maxArea = 0;
        int a = 0, z = height.length - 1;
        
        while(a < z){
            if(height[a] < height[z]){
                maxArea = Math.max(maxArea, height[a] * (z - a));
                a++;
            } else {
                maxArea = Math.max(maxArea, height[z] * (z - a));
                z--;
            }
        }
        
        return maxArea;
    }
	
	public static int maxArea(int[] height) {
        if(height == null || height.length == 0) return -1;
        int area = 0;
        int start = 0, end = height.length - 1;
        
        while(start < end) {
            int min = Math.min(height[start], height[end]);
            area = Math.max(area, min * (end - start));
            if(height[start] < height[end]) start++;
            else end--;
        }
        return area;   
    }

}
