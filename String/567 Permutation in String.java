/*
 Given two strings s1 and s2, write a function to return true if s2
  contains the permutation of s1. In other words, one of the first string's permutations 
  is the substring of the second string.


Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").
 */

import java.util.*;

class MinimumWindowSubstring {

	public static void main(String args[]) {
		System.out.println(" Starting Problem : https://leetcode.com/problems/permutation-in-string/");
		String s = "ab";
		String p = "eidboaoo";
		System.out.println(" Solution for the problem with one data-set");
		System.out.println(checkInclusion(s,p));
		String s2 = "ab";
		String p2 = "eidbaooo";
		System.out.println(" Solution for the problem with another data-set ");
		System.out.println(checkInclusion(s2,p2));

	}

	public static boolean checkInclusion(String s1, String s2) {
		int count[] = new int[256];
		for (char x : s1.toCharArray()) {
			count[x]++;
		}
		int left = 0;
		int i = 0;
		for (int right = 0; right < s2.length(); right++) {
			count[s2.charAt(right)]--;
			if (count[s2.charAt(right)] + 1 > 0) {
				i++;
			}
			while (i == s1.length()) {
				if (right - left + 1 == s1.length())
					return true;
				// To make window invalid by removing the left character.
				char temp = s2.charAt(left);
				count[temp]++;
				if (count[temp] - 1 >= 0) {
					i--;
				}
				left++;
			}
		}
		return false;
	}

}
//Time Complexity -O(S1)
//Space Complexity - O(1)
