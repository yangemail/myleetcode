package myleetcode.linkedlist.easy;

import org.w3c.dom.Node;

import myleetcode.linkedlist.ListNode;

public class Solution83_RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {

	}

}

/**
 * Thinking process: check head null Use dummy node to reserve head while
 * everything when head.next is not null compare head.val == head.next.val? If
 * so, head.next = head.next.next
 */
/*
 * Thoughts: 1. Check head. 2. Remove next if next != null && next.val ==
 * node.val 3. Use node to move
 */
class Solution83_1 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;

		ListNode node = head;
		while (node != null) {
			while (node.next != null && node.val == node.next.val) {
				node.next = node.next.next;
			}
			node = node.next;
		}
		return head;
	}
}
