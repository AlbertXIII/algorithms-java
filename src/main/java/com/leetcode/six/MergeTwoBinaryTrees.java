package com.leetcode.six;

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		// System.out.println(mergeTrees(new TreeNode(1,new TreeNode(3),2),new
		// TreeNode()));

	}

	private static TreeNode mergeTreesN(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;

		t1.val += t2.val;

		t1.left = mergeTreesN(t1.left, t2.right);
		t2.right = mergeTreesN(t1.right, t2.right);

		return t1;
	}

	public class TreeNode {
		
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
