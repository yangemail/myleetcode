package myleetcode.linkedlist;

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode createListNode(int[] items) {
		ListNode dummy = new ListNode();
		ListNode node = dummy;
		for (int item : items) {
			node.next = new ListNode();
			node = node.next;
			node.val = item;
		}
		return dummy.next;
	}

	public static void printListNodeToArray(ListNode node) {
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			sb.append(node.val + ", ");
			node = node.next;
		}
		String outcome = sb.substring(0, sb.length() - 2).toString();
		System.out.println("Print ListNode => " + outcome);
	}

}
