package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution101_SymmetricTree {

	public static void main(String[] args) {

	}

}

class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return false;
		return helper(root.left, root.right);
	}

	// help is just same as Solution100_SameTree.java
	public boolean helper(TreeNode p, TreeNode q) {
		if (p == null || q == null) {
			return p == null && q == null;
		}
		return p.val == q.val && helper(p.left, q.right) && helper(p.right, q.left);
	}
}