package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution111_MinimumDepthOfBinaryTree {

	public static void main(String[] args) {

	}

}

class Solution111_1 {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);

		if (root.left == null || root.right == null)
			return (root.left == null ? rightDepth : leftDepth) + 1;

		return Math.min(leftDepth, rightDepth) + 1;
	}
}

class Solution111_2 {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		if (root.left == null)
			return minDepth(root.right) + 1;
		if (root.right == null)
			return minDepth(root.left) + 1;

		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}