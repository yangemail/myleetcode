package myleetcode.tree.easy;

import myleetcode.tree.Node;

public class Solution559_MaximumDepthOfNaryTree {

	public static void main(String[] args) {

	}

}

class Solution559_1 {
	public int maxDepth(Node root) {
		if (root == null)
			return 0;

		int result = 1;
		for (Node child : root.children)
			result = Math.max(result, maxDepth(child) + 1);

		return result;
	}

	
}