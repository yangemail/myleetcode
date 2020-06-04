package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution437_PathSumIII {

	public static void main(String[] args) {

	}

}

/**
 * 这道题让我们求二叉树的路径的和等于一个给定值，说明了这条路径不必要从根节点开始，可以是中间的任意一段，
 * 而且二叉树的节点值也是有正有负。那么可以用递归来做，相当于先序遍历二叉树，对于每一个节点都有记录了一条从根节点到当前节点到路径， 同时用一个变量
 * curSum 记录路径节点总和，然后看 curSum 和 sum 是否相等，相等的话结果 res
 * 加1，不等的话继续查看子路径和有没有满足题意的，做法就是每次去掉一个节点，看路径和是否等于给定值，注意最后必须留一个节点，不能全去掉了，因为如果全去掉了，路径之和为0，而如果给定值刚好为0的话就会有问题，整体来说不算一道很难的题，参见代码如下：
 * 
 */
// TODO:
class Solution437_1 {

	public int pathSum(TreeNode root, int sum) {
		return -1;
	}

}
