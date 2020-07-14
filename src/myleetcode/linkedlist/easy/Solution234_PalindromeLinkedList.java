package myleetcode.linkedlist.easy;

import myleetcode.linkedlist.ListNode;

public class Solution234_PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = ListNode.createListNode(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 });
		boolean result = new Solution234_1().isPalindrome(head);
		System.out.println("Result => " + result);
	}

}

// TODO: Need to review
class Solution234_1 {
	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return true;

		ListNode mid = findMid(head);
		// 将中间节点之后的item,进行翻转. 将翻转后的list返回给 middle.next,
		// 即: 1->2->3->4->4->3->2->1，变为：1->2->3->4->1->2->3->4
		mid.next = reverse(mid.next);

		// 从头结点,和中间节点的下一个开始进行比较
		ListNode p1 = head;
		ListNode p2 = mid.next;
		while (p1 != null && p2 != null && p1.val == p2.val) {
			p1 = p1.next;
			p2 = p2.next;
		}

		// 必须是 p2 == null, 因为如果ListNode为1个, 那么p1有值, p2没有值。
		return p2 == null;
	}

	// 找到list中间的节点. 奇数节点,1->2->3,找到2; 偶数节点,1->2->3->4,找到2
	private ListNode findMid(ListNode head) {
		if (head == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private ListNode reverse(ListNode head) {
		// 生成 node 空节点
		ListNode node = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = node;
			node = head;
			head = tmp;
		}
		return node;
	}
}