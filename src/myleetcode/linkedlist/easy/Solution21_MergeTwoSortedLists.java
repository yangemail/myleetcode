package myleetcode.linkedlist.easy;

import myleetcode.linkedlist.ListNode;

public class Solution21_MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l1 = ListNode.createListNode(new int[] {1,2,4});
		ListNode l2 = ListNode.createListNode(new int[] {1,3,4});
		ListNode result = new Solution21_1().mergeTwoLists(l1, l2);
		ListNode.printListNodeToArray(result);
	}

}

class Solution21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        
        while(l1 != null && l2 != null) {
        	if(l1.val <= l2.val) {
        		node.next = l1;
        		l1 = l1.next;
        	} else {
        		node.next = l2;
        		l2 = l2.next;
        	}
        	node = node.next;
        }
        
        if(l1 != null) {
        	node.next = l1;
        }
        if(l2 != null) {
        	node.next = l2;
        }
        
        return dummy.next;
    }    
}