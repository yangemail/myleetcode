package myleetcode.tree.easy;

import java.util.HashSet;
import java.util.Set;

import myleetcode.tree.TreeNode;

public class Solution653_TwoSumIV_InputIsABST {

	public static void main(String[] args) {
		TreeNode root = TreeNode.createBinaryTreeByArray(new Integer[] { 5, 3, 6, 2, 4, null, 7 }, 0);
//		System.out.println(root);
		TreeNode.printConsle(root);
		int k = 9;
		boolean result = new Solution653_1().findTarget(root, k);
		System.out.println("Result => " + result);
	}

}

class Solution653_1 {
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer/* value after minus */> set = new HashSet<>();
		return twoSum(root, set, k);
	}

	public boolean twoSum(TreeNode root, Set<Integer> set, int k) {
		if (root == null)
			return false;

		// Validate the root.val, not the minus value
		if (set.contains(root.val))
			return true;

		// Set the minus value to container
		int minus = k - root.val;
		set.add(minus);

		return twoSum(root.left, set, k) || twoSum(root.right, set, k);
	}
}

class Solution653_2 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer/* value of minus */> set = new HashSet<Integer>();
        return twoSum(root, k, set);
    }
    
    public boolean twoSum(TreeNode root, int k, Set<Integer> set) {
    	if(root == null) {
    		return false;
    	}
    	if(set.contains(root.val)) {
    		return true;
    	}
    	int minus = k - root.val;
    	set.add(minus);
    	return twoSum(root.left, k, set) || twoSum(root.right, k, set);
    }
    
}