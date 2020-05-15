package myleetcode.stack.easy;

import java.util.Stack;

public class Solution20_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution20_1 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (Character c : s.toCharArray()) {
			if ("{[(".contains(String.valueOf(c))) {
				stack.push(c);
			} else {
				if (!stack.isEmpty() && isValid(stack.peek(), c)) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private boolean isValid(char a, char b) {
		return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
	}
}