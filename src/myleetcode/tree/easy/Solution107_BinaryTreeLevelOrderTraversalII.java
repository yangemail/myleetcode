package myleetcode.tree.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import myleetcode.tree.TreeNode;

public class Solution107_BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {

	}

}

class Solution107_1 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			ArrayList<Integer> level = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);
			}
			result.add(level);
		}

		Collections.reverse(result);
		return result;
	}

}