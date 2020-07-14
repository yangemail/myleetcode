package myleetcode.linkedlist.medium;

import myleetcode.linkedlist.ListNode;

public class Solution147_InsertionSortList {

	public static void main(String[] args) {
		ListNode head = ListNode.createListNode(new int[] {-1,5,3,4,0});
		ListNode result = new Solution147_1().insertionSortList(head);
		ListNode.printListNodeToArray(result);
	}

}

/**
链表的插入排序实现原理很简单，就是一个元素一个元素的从原链表中取出来，然后按顺序插入到新链表中，时间复杂度为 O(n2)，是一种效率并不是很高的算法，但是空间复杂度为 O(1)，以高时间复杂度换取了低空间复杂度，参见代码如下：
*/
// TODO: Need to review it.
class Solution147_1 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        
        while(head != null) {
        	// 保存head位置
        	ListNode tmp = head.next;
        	ListNode current = dummy;
        	while(current.next != null && current.next.val <= head.val) {
        		current = current.next;
        	}
        	// 插入
        	head.next = current.next;
        	current.next = head;
        	// 回复head
        	head = tmp;
        }
        
        return dummy.next;
    }
}