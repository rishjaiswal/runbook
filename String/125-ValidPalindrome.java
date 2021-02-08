
/*
https://leetcode.com/problems/valid-palindrome/

Given a string, determine if it is a palindrome, considering only
 alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as 
valid palindrome.

*/
import java.util.*;

class ValidPalindrome {

	public static void main(String args[]) {
		System.out.println(" Starting Problem :https://leetcode.com/problems/valid-palindrome/");
		String s = "A man, a plan, a canal: Panama";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(isPalindrome(s));
		String s2 = "race a car";
		System.out.println(" Solution for the problem-1 ");
		System.out.println(isPalindrome(s2));

	}

	public static boolean isPalindrome(String s) {
		if(s==null){
	        return false;
	    }
	        int left=0;
	        int right=s.length()-1;
	        s = s.toLowerCase();
	        while(left<right)
	        {
	        	while(left<right && !((s.charAt(left)>='0' && s.charAt(left)<='9') || (s.charAt(left)>='a' && s.charAt(left)<='z')))
	        	{
	        		left++;
	        	}
	            while ((left<right) && !((s.charAt(right)>='0' && s.charAt(right)<='9') || (s.charAt(right)>='a' && s.charAt(right)<='z')))
	        	{
	        		right--;
	        	}
	            if(s.charAt(left)!=s.charAt(right))
	                return false;
	            left++;
	            right--;
	        }
	        return true;
	    }
}
//Time Complexity -O(S)
//Space Complexity - O(1)