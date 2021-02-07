
/*
https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/

Given a binary string s and an integer k.

Return True if every binary code of length k is a substring of s.
 Otherwise, return False.

*/
import java.util.*;

class BinaryCodeSizeK {

	public static void main(String args[]) {
		System.out.println(
				" Starting Problem : https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/");
		String s = "00110110";
		int k = 2;
		System.out.println(" Solution for the problem-1 ");
		System.out.println(hasAllCodes(s, k));
		String s2 = "0110";
		int k2 = 2;
		System.out.println(" Solution for the problem- 2");
		System.out.println(hasAllCodes(s2, k2));
	}

	public static boolean hasAllCodes(String s, int k) {
		// sliding window approach- broke into same size k
		int start = 0;
		int count = 0;
		HashSet<String> hs = new HashSet();
		for (int i = 0; i < s.length(); i++) {
			count++;
			if (count == k) {
				hs.add(s.substring(start, start + k));
				start++;
				count--;
			}
		}

		return hs.size() == Math.pow(2, k);

	}
}