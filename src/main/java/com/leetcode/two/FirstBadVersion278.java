package com.leetcode.two;

/**
 * @sk fb google 
 *
 */
public class FirstBadVersion278 {

	public static void main(String[] args) {
		System.out.println(firstBadVersionK(5));

	}
	
	private static int firstBadVersionK(int n) {
        //bs O(log n)
        int left = 1, right = n;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            if(!isBadVersion(mid)) left = mid + 1;
            else right = mid;            
        }
        
        return left;
    }
	
	private static boolean isBadVersion(int version) {
		System.out.println("Version: " + version);
		boolean bad = false;
		if(version == 4) bad = true;
		return bad;
	}

}
