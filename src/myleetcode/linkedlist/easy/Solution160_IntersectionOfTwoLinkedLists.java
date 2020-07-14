package myleetcode.linkedlist.easy;

import myleetcode.linkedlist.ListNode;

public class Solution160_IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {

	}

}

class Solution160_1 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		// Step 1: Count size
		int countA = this.calListSize(headA);
		int countB = this.calListSize(headB);
		// Find differences
		int diff = Math.abs(countA - countB);

		// Step 2: Shift node
		if (countA > countB) {
			headA = this.shiftNode(headA, diff);
		} else {
			headB = this.shiftNode(headB, diff);
		}

		// Step 3: Verify if there is a intersection
		while (headA != null && headB != null) {
			if (headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		
		return null;
	}

	private int calListSize(ListNode node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	private ListNode shiftNode(ListNode node, int shift) {
		while (shift != 0) {
			node = node.next;
			shift--;
		}
		return node;
	}
}