package com.leetcode.two;

public class ReverseLinkedList206 {

	public static void main(String[] args) {
		ListNode node = new ListNode(1, new ListNode(2));

	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		
		while(head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
