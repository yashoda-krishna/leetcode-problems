package test_app1;

/*


125. Valid Palindrome
Easy

9379

8366

Add to List

Share
A phrase is a palindrome if, after converting all uppercase letters into 
lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
 Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


*/

public class M17 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		M17 obj = new M17();
		System.out.println(obj.isPalindrome(s));
	}
	
	public boolean isPalindrome(String s) {
		String newStr = "";
		char c1;
		for(int i = 0; i<s.length();i++) {
			c1 = s.charAt(i);
			if(Character.isLetterOrDigit(c1)) {
				newStr +=c1;
			}
		}
		
		newStr = newStr.toLowerCase();
		
		int start = 0, end = newStr.length() - 1;
		
		while(start <= end) {
			if(newStr.charAt(start) != newStr.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
