package myleetcode.linkedlist.medium;

import myleetcode.linkedlist.ListNode;
import myleetcode.tree.TreeNode;

public class Solution109_ConvertSortedListToBinarySearchTree {

	public static void main(String[] args) {

	}

}

class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		return helper(head, null);
	}

	private TreeNode helper(ListNode head, ListNode tail) {
		if (head == tail)
			return null;
		ListNode fast = head;
		ListNode slow = head;
		while(fast != tail && fast.next != tail) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode mid = new TreeNode(slow.val);
		mid.left = helper(head, slow);
		mid.right = helper(slow.next, tail);
		return mid;
	}
}