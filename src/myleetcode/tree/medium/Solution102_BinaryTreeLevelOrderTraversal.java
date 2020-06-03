package myleetcode.tree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import myleetcode.tree.TreeNode;

public class Solution102_BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

	}

}

class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> level = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			result.add(level);
		}
		
		return result;
	}
}