
/*
https://leetcode.com/problems/score-of-parentheses/

Given a balanced parentheses string S, 
compute the score of the string based on the following rule:

() has score 1
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.

*/
import java.util.*;

class ScoreOfParantheses {

	public static void main(String args[]) {
		System.out.println(" Starting Problem :https://leetcode.com/problems/score-of-parentheses/");
		String s3 = "()()";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(scoreOfParenthese(s3));
		String s2 = "(()(()))";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(scoreOfParenthese(s2));
		String s1 = "(())";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(scoreOfParenthese(s1));
		String s = "()";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(scoreOfParenthese(s));
	}

	public static int scoreOfParenthese(String S) {

		Stack<Integer> stack = new Stack();
		stack.push(0); // The score of the current frame

		for (char c: S.toCharArray()) {
			if (c == '(')
				stack.push(0);
			else {
				int v = stack.pop();
				int w = stack.pop();
				stack.push(w + Math.max(2 * v, 1));
			}
		}

		return stack.pop();
        
    }

}
//Time Complexity -O(S)
//Space Complexity - O(1)