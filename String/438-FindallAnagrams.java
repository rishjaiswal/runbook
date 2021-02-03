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

*/
import java.util.*;

class FindallAnagarams {

	public static void main(String args[]) {
		System.out.println(" Starting Problem : https://leetcode.com/problems/find-all-anagrams-in-a-string/");
		String s = "cbaebabacd" ;
		String p = "abc" ;
		List<Integer> answer = findAnagrams(s,p);
		System.out.println(" Solution for the problem");
		for(int x : answer)
		{
			System.out.println(x);
		}
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> al = new ArrayList();
		HashMap<Character, Integer> hm = buildHashMap(p);
		for (int i = 0; i <= s.length() - p.length(); i++) {
			HashMap<Character, Integer> hm1 = buildHashMap(s.substring(i, i + p.length()));
			if (hm1.equals(hm))
				al.add(i);

		}
		return al;
	}

	public static HashMap<Character, Integer> buildHashMap(String p) {
		HashMap<Character, Integer> hm = new HashMap();
		for (char x : p.toCharArray()) {
			if (hm.containsKey(x))
				hm.put(x, hm.get(x) + 1);
			else
				hm.put(x, 1);
		}
		return hm;
	}
}