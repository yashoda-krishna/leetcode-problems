package test_app1;

/*


680. Valid Palindrome II
Easy

8226


Add to List

Share
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 


*/

public class M18 {
	public static void main(String[] args) {
		M18 obj = new M18();
		String s = "aba";
		System.out.println(obj.validPalindrome2(s));
		String s1 = "abaa";
		System.out.println(obj.validPalindrome2(s1));
		String s2 = "abc";
		System.out.println(obj.validPalindrome2(s2));
	}
	
	public boolean validPalindrome2(String s) {
		int start = 0, end = s.length() - 1;
		while(start <= end && s.charAt(start) == s.charAt(end)) {
			start++;
			end --;
		}
		if(start > end) {
			return true;
		}
		boolean a = isPalindrome(s, start + 1, end);
		boolean b = isPalindrome(s, start, end - 1);
		return  a || b;
	}
	boolean isPalindrome(String s, int start, int end) {
		while(start <= end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
