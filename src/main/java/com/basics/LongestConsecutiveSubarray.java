package com.basics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestConsecutiveSubarray {
	
	public static void main (String[] args) {
	    int[] nums = {1,-1,0,3,2,9,8,16,19,10,18,-2};
			//System.out.println("Consecutive Elements: "+ getConsecutiveElems(nums));
	    getConsecutiveElems(nums);
		}
	  
	  private static Integer[] getConsecutiveElems(int[] nums){
	    Arrays.sort(nums);
	    int start = 0, end = 0, len = 1;
	    for(int i = 0; i < nums.length - 1; i++){
	      
	      int min = nums[i], max = nums[i];
	      
	      for(int j = i + 1; j < nums.length; j++){
	        min = Math.min(min, nums[j]);
	        max = Math.max(max, nums[j]);
	        
	        if(checkConsecutive(nums, i, j, min, max)){
	          
	          if(len < max - min +1){
	            len = max -min +1;
	            start = i;
	            end = j;
	          }
	          
	        }
	        
	      }
	      
	    }
	     Integer[] subarray = IntStream.range(start, end + 1)
	                                .mapToObj(i -> nums[i])
	                                .toArray(Integer[]::new);
	                          
	    System.out.println(Arrays.toString(subarray));
	    return subarray; 
	  
	  }
	  
	  private static boolean checkConsecutive(int[] nums, int i, int j, int min, int max){
	    
	    if(max - min  != j - i) return false;
	    boolean visited[] = new boolean[j - i +1];
	    for(int k = i; k <= j; k++){
	        if(visited[nums[k] - min]) return false;
	        visited[nums[k] - min] = true;      
	    }
	    return true;
	  }

}
