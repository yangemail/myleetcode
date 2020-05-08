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
		// dummy节点，一般都会初始一个dummy方便操作，然后return dummy.next为实际值。
		ListNode dummy = new ListNode(-1);
		// dummy节点的另一个名字 => node，方便后期操作。
		ListNode node = dummy;
		// 传递到下一个节点的数值
		int carry = 0;

		while (l1 != null || l2 != null) {
			// 将carry的值，付给当前node的下一个节点.
			node.next = new ListNode(carry);
			// 将当前dummy Node节点，下移一个Node
			node = node.next;

			if (l1 != null) {
				node.val += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				node.val += l2.val;
				l2 = l2.next;
			}

			// 分析node.val是否是超过10的数值，如果有，将10位以上的给carry
			carry = node.val / 10;
			// 对于node.val用10取模，获得各位数值。
			node.val = node.val % 10;
		}

		// 如果carry还有数值则，赋值给最后一位。
		if (carry != 0) {
			node.next = new ListNode(carry);
		}

		return dummy.next;
	}
}
