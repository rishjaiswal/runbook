
/*
 https://leetcode.com/problems/find-all-anagrams-in-a-string/

Given a string s and a non-empty string p, find all the start indices of 
p's anagrams in s.

Strings consists of lowercase English letters only and the length of both 
strings s and p will not be larger than 20,100.

The order of output does not matter.

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Similar Approach to Apply :- 
76. Minimum window substring
567. Permutation in String
*/
import java.util.*;

class FindallAnagaramsOptimised {

	public static void main(String args[]) {
		System.out.println(" Starting Problem : https://leetcode.com/problems/find-all-anagrams-in-a-string/");
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> answer = findAnagrams(s, p);
		System.out.println(" Solution for the problem");
		for (int x : answer) {
			System.out.println(x);
		}
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> al = new ArrayList();
		int char_count[] = new int[256];
		//Store count array to all ASCII characters count in array.
		for (char c : p.toCharArray()) {
			char_count[c]++;
		}
		int count = 0;
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			char_count[c]--;
			if (char_count[c] + 1 > 0)
				count++;
			//When string length is same equal to window having all characters and then move left pointer.
			while (count == p.length()) {
				// Window size same and storing the result.
				if (right - left + 1 == p.length())
					al.add(left);
				//To make window invalid by removing the left character.
				char temp = s.charAt(left);
				char_count[temp]++;
				if (char_count[temp] - 1 >= 0) {
					count--;
				}
				left++;
			}
		}
		return al;
	}
}