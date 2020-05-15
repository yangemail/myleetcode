package myleetcode.linkedlist.easy;

import myleetcode.linkedlist.ListNode;

public class Solution203_RemoveLinkedListElements {

	public static void main(String[] args) {

	}

}

class Solution203_1 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		// 将Dummy赋值给Head，现在Head就是Dummy了。
		head = dummy;

		while (head.next != null) {
			if (head.next.val == val) {
				// 如果等于，用head.next.next替换当前head.next节点
				head.next = head.next.next;
			} else {
				// 如果不等于，用head.next替换head节点，现在head节点就是head.next了
				head = head.next;
			}
		}
		
		return dummy.next;
	}
}
