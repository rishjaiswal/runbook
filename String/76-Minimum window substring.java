/*
 Given two strings s and t, return the minimum window in s which will contain all the 
 characters in t. If there is no such window in s that covers all characters in t, 
 return the empty string "".

Note that If there is such a window, it is guaranteed that there will always be only
 one unique minimum window in s.
 */

import java.util.*;

class MinimumWindowSubstring {

	public static void main(String args[]) {
		System.out.println(" Starting Problem : https://leetcode.com/problems/minimum-window-substring/");
		String s = "ADOBECODEBANC";
		String p = "ABC";
		String answer = minWindow(s, p);
		System.out.println(" Solution for the problem");
		System.out.println(answer);

	}

	public static String minWindow(String s, String t) {

		int count[] = new int[256];
		for (char x : t.toCharArray()) {
			count[x]++;
		}
		int left = 0;
		int inc = 0;
		int min = Integer.MAX_VALUE;
		String mins = "";
		for (int right = 0; right < s.length(); right++) {
			count[s.charAt(right)]--;
			if (count[s.charAt(right)] + 1 > 0) {
				inc++;
			}
			while (inc == t.length()) {
				// Window size same and storing the result.
				if (right - left + 1 < min) {
					min = right - left + 1;
					mins = s.substring(left, right + 1);
				}

				// To make window invalid by removing the left character.
				char temp = s.charAt(left);
				count[temp]++;
				if (count[temp] - 1 >= 0) {
					inc--;
				}
				left++;
			}
		}

		return mins;
	}
}

//Time Complexity -O(s)
//Space Complexity -O(1)