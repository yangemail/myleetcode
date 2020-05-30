package myleetcode.linkedlist.medium;

import myleetcode.linkedlist.ListNode;

public class Solution82_RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		int[] items = {1,2,3,3,4,4,5};
		ListNode head = ListNode.createListNode(items);
		ListNode node = new Solution82_1().deleteDuplicates(head);
		ListNode.printListNodeToArray(node);
	}

}

/**
 * 和之前那道 Remove Duplicates from Sorted List 不同的地方是这里要删掉所有的重复项，
 * 由于链表开头可能会有重复项，被删掉的话头指针会改变，而最终却还需要返回链表的头指针。
 * 所以需要定义一个新的节点，然后链上原链表，然后定义一个前驱指针和一个现指针，
 * 每当前驱指针指向新建的节点，现指针从下一个位置开始往下遍历，遇到相同的则继续往下， 直到遇到不同项时，把前驱指针的next指向下面那个不同的元素。
 * 如果现指针遍历的第一个元素就不相同，则把前驱指针向下移一位。
 * 
 * 代码如下：
 *
 */
// TODO: Need to review
class Solution82_1 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(-1);
		ListNode pre = dummy;
		dummy.next = head;
		while(pre.next != null) {
			ListNode cur = pre.next;
			while(cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if(cur != pre.next) {
				pre.next = cur.next;
			} else {
				pre = pre.next;
			}
		}
		return dummy.next;
	}
}