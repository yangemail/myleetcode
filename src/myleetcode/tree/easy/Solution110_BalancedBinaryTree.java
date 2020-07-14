package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution110_BalancedBinaryTree {

	public static void main(String[] args) {

	}

}

class Solution110_1 {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;

		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);

		if (Math.abs(leftDepth - rightDepth) > 1)
			return false;

		return isBalanced(root.left) && isBalanced(root.right);
	}

	public int maxDepth(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
	}
}
