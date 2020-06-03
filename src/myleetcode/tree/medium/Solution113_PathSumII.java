package myleetcode.tree.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import myleetcode.tree.TreeNode;

public class Solution113_PathSumII {

	public static void main(String[] args) {

	}

}

/**
 * 这道二叉树路径之和在之前那道题 Path Sum 的基础上又需要找出路径，但是基本思想都一样，还是需要用深度优先搜索
 * DFS，只不过数据结构相对复杂一点，需要用到二维的 vector，而且每当 DFS
 * 搜索到新结点时，都要保存该结点。而且每当找出一条路径之后，都将这个保存为一维 vector 的路径保存到最终结果二维 vector 中。 并且，每当
 * DFS搜索到子结点，发现不是路径和时，返回上一个结点时，需要把该结点从一维 vector 中移除，参见代码如下：
 *
 */
class Solution113_1 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> out = new ArrayList<>();
		helper(root, sum, out, result);
		return result;
	}

	void helper(TreeNode node, int sum, List<Integer> out, List<List<Integer>> result) {
		// TODO:
	}
}