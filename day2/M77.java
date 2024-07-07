package collections_app1;
/*
 Valid Anagram
 
 
 
 Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

 
 */



import java.util.Arrays;

public class M77 {
	public static void main(String[] args) {
		M77 obj = new M77();
		System.out.println(obj.isAnagram("nagaram", "anagram"));
		System.out.println(obj.isAnagram("care", "race"));
	}
	
	public boolean isAnagram(String s, String t) {
		char[] chars1 = s.toCharArray();
		Arrays.sort(chars1);
		s = new String(chars1);
		
		char[] chars2 = t.toCharArray();
		Arrays.sort(chars2);
		t = new String(chars2);
		
		boolean flag = s.equals(t);
		
		return flag;
	}
}
