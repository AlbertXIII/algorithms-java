package com.amazon;

public class MaxEvents {

	public static void main(String[] args) {
		System.out.println(maxEvents(new int[] {1,3,3,4,5,7}, new int[] {2,2,1,1,2,1}));
	}
	
	public static int maxEvents(int[] arrival, int[] duration) {
		int max = 0, start = 0, end = 0;
		for(int i = 0; i < arrival.length; i++){    
	        if(max == 0) {
	            start = arrival[i];
	            end = arrival[i] + duration[i];
	            max++;
	        }
	        if(start == arrival[i] && end > arrival[i] + duration[i]){
	            end = arrival[i] + duration[i];
	        }
	        if(arrival[i] >= end){
	            start = arrival[i];
	            end = arrival[i] + duration[i];
	            max ++;
	        }
	        
	    
		}
		return max;
	}

}
