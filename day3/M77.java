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



/*



package strings_app2;

import java.util.Scanner;

public class M22 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first string");
	String s1 = sc.next();
	System.out.println("enter 2nd string");
	String s2 = sc.next();
	if(s1.length() != s2.length()) {
		System.out.println(s1 + " and "+ s2 + "are not anagrams");
		return;
	}
	String temp = s2;
	boolean flag = true;
	char c1;
	int index;
	for(int i = 0; i < s1.length(); i++) {
		c1 = s1.charAt(i);
		index = temp.indexOf(c1);
		if(index != -1) {
			temp = temp.substring(0, index) + temp.substring(index + 1, temp.length());
		}
		else {
			flag = false;
			break;
		}
	}
	
	if(temp.length() != 0) {
		flag = false;
	}
	System.out.println(s1 +" and " + s2 +" are " + (flag ? "anagrams" : "not anagrams"));
}
}






*/

