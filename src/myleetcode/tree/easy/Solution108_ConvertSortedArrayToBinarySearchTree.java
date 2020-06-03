package myleetcode.tree.easy;

import myleetcode.tree.TreeNode;

public class Solution108_ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {

	}

}

/**
 * 这道题是要将有序数组转为二叉搜索树， 所谓二叉搜索树，是一种始终满足左<根<右的特性， 如果将二叉搜索树按中序遍历的话，得到的就是一个有序数组了。
 * 那么反过来，我们可以得知，根节点应该是有序数组的中间点，从中间点分开为左右两个有序数组，
 * 在分别找出其中间点作为原中间点的左右两个子节点，这不就是是二分查找法的核心思想么。 所以这道题考的就是二分查找法，
 * 
 * 代码如下：
 *
 */
class Solution108_1 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public TreeNode helper(int[] nums, int left, int right) {
		if (left > right)
			return null;

		int mid = left + (right - left) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, left, mid - 1);
		node.right = helper(nums, mid + 1, right);

		return node;
	}
}
