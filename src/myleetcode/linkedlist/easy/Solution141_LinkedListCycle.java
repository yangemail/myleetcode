package myleetcode.linkedlist.easy;

import java.util.HashSet;
import java.util.Set;

import myleetcode.linkedlist.ListNode;

public class Solution141_LinkedListCycle {

	public static void main(String[] args) {

	}

}

// Method 1: Fast / Slow pointer:
// fast pointer will eventually catch up with slow pointer.
class Solution141_1 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;

		// Start at different spot
		ListNode slow = head;
		ListNode fast = head.next;

		// End loop when slow == fast, means there is a cycle, then return true;
		while (slow != fast) {
			if (fast == null || fast.next == null)
				return false;
			slow = slow.next; // Move 1 step
			fast = fast.next.next; // Move 2 steps
		}

		return true;
	}
}

class Solution141_2 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		ListNode slow = head;
		ListNode fast = head;
		while (slow != fast) {
			if (fast.next == null || fast.next.next == null)
				return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}

class Solution141_3 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		
		Set<ListNode> set = new HashSet<>();
		while (head != null) {
			if (!set.add(head))
				return true;
			
			head = head.next;
		}
		
		return false;
	}
}