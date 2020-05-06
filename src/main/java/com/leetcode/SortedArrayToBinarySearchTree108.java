package com.leetcode;

public class SortedArrayToBinarySearchTree108 {

	public static void main(String[] args) {
		SortedArrayToBinarySearchTree108 cl = new SortedArrayToBinarySearchTree108();
		TreeNode tn = cl.sortedArrayToBST(new int[] {-10, -3, 0, 5, 9});
		System.out.println(tn.val + " " + tn.left + tn.right);
	}
	
	 public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length == 0) return null;
	        return buildTree(nums, 0, nums.length - 1);
	    }
	    
	    public TreeNode buildTree(int[] nums,int left, int right){
	        if(left > right) return null;
	        int midpoint = left + (right - left) / 2;
	        TreeNode node = new TreeNode(nums[midpoint]);
	        node.left = buildTree(nums, left, midpoint - 1);
	        node.right = buildTree(nums, midpoint + 1, right);
	        return node;
	    }
	    
	    public class TreeNode {
	    	      int val;
	    	      TreeNode left;
	    	      TreeNode right;
	    	      TreeNode() {}
	    	      TreeNode(int val) { this.val = val; }
	    	      TreeNode(int val, TreeNode left, TreeNode right) {
	    	          this.val = val;
	    	          this.left = left;
	    	          this.right = right;
	    	      }
	    	  }

}
