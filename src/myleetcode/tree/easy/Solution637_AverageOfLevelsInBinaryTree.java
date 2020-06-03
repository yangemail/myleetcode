package myleetcode.tree.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import myleetcode.tree.TreeNode;

public class Solution637_AverageOfLevelsInBinaryTree {

	public static void main(String[] args) {

	}

}

class Solution637_1 {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			double sum = 0.0d;
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				sum += node.val;
				if(node.left != null) queue.offer(node.left);
				if(node.right != null) queue.offer(node.right);
			}
			result.add(sum / size);
		}
		return result;
	}
}