package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution104_MaximumDepthOfBinaryTree {

	public static void main(String[] args) {

	}

}

/**
 * 求二叉树的最大深度问题用到深度优先搜索 Depth First Search，
 * 递归的完美应用，跟求二叉树的最小深度问题原理相同， 
 * 
 * 参见代码如下：
 *
 */
class Solution104_1 {
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}