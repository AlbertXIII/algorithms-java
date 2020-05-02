package com.leetcode;

import java.util.Arrays;

public class MeetingRooms252 {
	
	public class Interval{
		int start;
		int end;
		Interval(){start = 0; end = 0;}
		Interval(int s, int e){start = s; end = e;}
	}

	public static void main(String[] args) {
		

	}
	
	public boolean canAttendMeetings(Interval[] intervals) {
		
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		
		for(int i = 0; i < intervals.length; i++) {
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
			
		}
		
		Arrays.sort(starts);
		Arrays.sort(ends);
		
		for(int i = 0; i < starts.length -1; i++) {
			if(starts[i +1] < ends[i]) return false;
		}
		
		return false;
		
	}

}
