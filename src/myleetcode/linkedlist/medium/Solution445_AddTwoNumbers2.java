package myleetcode.linkedlist.medium;

import java.util.Stack;

import myleetcode.linkedlist.ListNode;

public class Solution445_AddTwoNumbers2 {

	public static void main(String[] args) {
//		ListNode l1 = ListNode.createListNode(new int[] { 7, 2, 4, 3 });
//		ListNode l2 = ListNode.createListNode(new int[] { 5, 6, 4 });
		ListNode l1 = ListNode.createListNode(new int[] { 5 });
		ListNode l2 = ListNode.createListNode(new int[] { 5 });
//		ListNode.printListNodeToArray(l1);
//		ListNode.printListNodeToArray(l2);
		ListNode node = new Solution445_1().addTwoNumbers(l1, l2);
		ListNode.printListNodeToArray(node);
	}

}

class Solution445_1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		while (l1 != null) {
			s1.push(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			s2.push(l2.val);
			l2 = l2.next;
		}

		ListNode node = new ListNode();

		while (!s1.isEmpty() || !s2.isEmpty()) {
			if (!s1.isEmpty()) {
				node.val += s1.pop();
			}
			if (!s2.isEmpty()) {
				node.val += s2.pop();
			}
			
			ListNode head = new ListNode(node.val / 10);
			node.val %= 10;
			head.next = node;
			node = head;
		}

		return node.val == 0 ? node.next : node;
	}
}
