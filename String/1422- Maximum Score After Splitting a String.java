
/*
https://leetcode.com/problems/maximum-score-after-splitting-a-string/

Given a string s of zeros and ones, return the maximum score after splitting the 
string intotwo non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus
 the number of ones in the right substring.

*/
import java.util.*;

class MaximumScore {

	public static void main(String args[]) {
		System.out.println(" Starting Problem : https://leetcode.com/problems/maximum-score-after-splitting-a-string/");
		String s = "011101";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(maxScore(s));

	}

	public static int maxScore(String s) {
		int max = 0;
		int ones = 0;
		int zeros = 0;
		//Count number of 1's
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				ones++;
			}
		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0') {
				zeros++;
			} else {
				ones--;
			}
			max = Math.max(zeros + ones, max);
		}

		return max;
	}
}