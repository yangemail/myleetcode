package myleetcode.linkedlist.medium;

import myleetcode.linkedlist.ListNode;

public class Solution143_ReorderList {

	public static void main(String[] args) {

	}

}

/**
 * 这道链表重排序问题可以拆分为以下三个小问题：
 * 
 * 1. 使用快慢指针来找到链表的中点，并将链表从中点处断开，形成两个独立的链表。
 * 
 * 2. 将第二个链翻转。
 * 
 * 3. 将第二个链表的元素间隔地插入第一个链表中。
 *
 */
class Solution143_1 {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null)
			return;

		// Step 1.
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode mid = slow.next;
		slow.next = null;

		// Step 2. reverse
		ListNode last = mid;
		ListNode pre = null;
		while (last != null) {
			ListNode tmp = last.next;
			last.next = pre;
			pre = last;
			last = tmp;
		}

		// Step 3. merge
		while (head != null && pre != null) {
			ListNode tmp = head.next;
			head.next = pre;
			pre = pre.next;
			head.next.next = tmp;
			head = tmp;
		}
	}

}