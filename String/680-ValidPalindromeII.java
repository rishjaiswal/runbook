
/*
https://leetcode.com/problems/valid-palindrome-ii/

Given a non-empty string s, you may delete at most one character.
 Judge whether you can make it a palindrome.

*/
import java.util.*;

class ValidPalindromeII {

	public static void main(String args[]) {
		System.out.println(" Starting Problem :https://leetcode.com/problems/valid-palindrome-ii/");
		String s = "aba";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(validPalindrome(s));
		String s2 = "abca";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(validPalindrome(s2));
		String s1 = "abcda";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(validPalindrome(s1));

	}

	public static boolean validPalindrome(String s) {
		if(s==null){
	        return false;
	    }
        int left=0;
        int right=s.length()-1;
		while(left<=right)
		{
            if(s.charAt(left)!=s.charAt(right))
                return (isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1) );
            left++;
            right--;
		}
		
		return true;
			
	    }

	public static boolean isPalindrome(String s, int left, int right) {
		s = s.toLowerCase();
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}
//Time Complexity -O(S)
//Space Complexity - O(1)