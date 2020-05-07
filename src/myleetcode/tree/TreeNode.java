package myleetcode.tree;

import java.io.PrintStream;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static TreeNode createBinaryTreeByArray(Integer[] array, int index) {
		TreeNode treeNode = null;
		if (index < array.length) {
			Integer value = array[index];
			if (value == null) {
				return null;
			}
			treeNode = new TreeNode(value);
			treeNode.left = createBinaryTreeByArray(array, 2 * index + 1);
			treeNode.right = createBinaryTreeByArray(array, 2 * index + 2);
			return treeNode;
		}
		return treeNode;
	}

	public static void traversePreOrder(StringBuilder sb, String padding, String pointer, TreeNode node) {
	    if (node != null) {
	        sb.append(padding);
	        sb.append(pointer);
	        sb.append(node.val);
	        sb.append("\n");
	 
	        StringBuilder paddingBuilder = new StringBuilder(padding);
	        paddingBuilder.append("©¦  ");
	 
	        String paddingForBoth = paddingBuilder.toString();
	        String pointerForRight = "©¸©¤©¤";
	        String pointerForLeft = (node.right != null) ? "©À©¤©¤" : "©¸©¤©¤";
	 
	        traversePreOrder(sb, paddingForBoth, pointerForLeft, node.left);
	        traversePreOrder(sb, paddingForBoth, pointerForRight, node.right);
	    }
	}

	public static void print(PrintStream os, TreeNode node) {
	    StringBuilder sb = new StringBuilder();
	    traversePreOrder(sb, "", "", node);
	    os.print(sb.toString());
	}
	
	public static void printConsle(TreeNode node) {
		print(System.out, node);
	}
	
}
