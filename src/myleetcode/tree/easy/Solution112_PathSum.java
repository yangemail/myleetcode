package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution112_PathSum {

	public static void main(String[] args) {

	}

}

class Solution112_1 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null && root.val == sum)
			return true;
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}
}