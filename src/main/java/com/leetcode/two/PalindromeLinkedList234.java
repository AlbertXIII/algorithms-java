package com.leetcode.two;

public class PalindromeLinkedList234 {

	public static void main(String[] args) {
		//System.out.println(isPalindrome());
	}

	private static boolean isPalindrome(ListNode head) {
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow = reversed(slow);
		fast = head;
		
		while(slow != null) {
			if(slow.val != fast.val) return false;
			slow = slow.next;
			fast = fast.next;
		}
		
		return true;
	}
	
	private static ListNode reversed(ListNode head){
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
	

	public class ListNode {
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
