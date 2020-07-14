package myleetcode.linkedlist.easy;

import myleetcode.linkedlist.ListNode;

public class Solution237_DeleteNodeInALinkedList {

	public static void main(String[] args) {

	}

}

class Solution237_1 {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null) {
        	return;
        }
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}