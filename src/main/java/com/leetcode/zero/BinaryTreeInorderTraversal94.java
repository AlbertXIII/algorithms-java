package com.leetcode.zero;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static List<Integer> inorderTraversal(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		LinkedList<Integer> inorder = new LinkedList<>();
		if (root == null)
			return inorder;

		TreeNode current = root;

		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			inorder.add(current.val);
			current = current.right;
		}

		return inorder;

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
