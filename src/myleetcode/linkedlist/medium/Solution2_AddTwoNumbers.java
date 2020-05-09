package myleetcode.linkedlist.medium;

import myleetcode.linkedlist.ListNode;

public class Solution2_AddTwoNumbers {

	public static void main(String[] args) {

	}

}

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution2_1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode node = dummy;
		int carry = 0;

		while (l1 != null || l2 != null) {
			node.next = new ListNode(carry);
			node = node.next;

			if (l1 != null) {
				node.val += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				node.val += l2.val;
				l2 = l2.next;
			}

			carry = node.val / 10;
			node.val = node.val % 10;
		}

		if (carry != 0) {
			node.next = new ListNode(carry);
		}

		return dummy.next;
	}
	
}
