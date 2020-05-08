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
		// dummy�ڵ㣬һ�㶼���ʼһ��dummy���������Ȼ��return dummy.nextΪʵ��ֵ��
		ListNode dummy = new ListNode(-1);
		// dummy�ڵ����һ������ => node��������ڲ�����
		ListNode node = dummy;
		// ���ݵ���һ���ڵ����ֵ
		int carry = 0;

		while (l1 != null || l2 != null) {
			// ��carry��ֵ��������ǰnode����һ���ڵ�.
			node.next = new ListNode(carry);
			// ����ǰdummy Node�ڵ㣬����һ��Node
			node = node.next;

			if (l1 != null) {
				node.val += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				node.val += l2.val;
				l2 = l2.next;
			}

			// ����node.val�Ƿ��ǳ���10����ֵ������У���10λ���ϵĸ�carry
			carry = node.val / 10;
			// ����node.val��10ȡģ����ø�λ��ֵ��
			node.val = node.val % 10;
		}

		// ���carry������ֵ�򣬸�ֵ�����һλ��
		if (carry != 0) {
			node.next = new ListNode(carry);
		}

		return dummy.next;
	}
}
