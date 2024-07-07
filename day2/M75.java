package collections_app1;

/*
3. Longest Substring Without Repeating Characters


Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/


import java.util.HashMap;

public class M75 {
	public static void main(String[] args) {
		M75 obj = new M75();
		String s1 = "abcabcbb";
		System.out.println(obj.lengthOfLongestSubstring(s1));
		
	}
		
		 public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c1;
		int i=0;
		int j=0;
		int max=0;
		for(;i<s.length();i++) {
			c1 = s.charAt(i);
			if(map.containsKey(c1)) {
				max = Math.max(max, (i - j));
				while(map.containsKey(c1)) {
					map.remove(s.charAt(j));
					j++;
				}
			}
			map.put(c1,i);
		}
		max = Math.max(max, (i - j));
		return max;
}
}


/*

import java.util.HashMap;

public class M74 {
public static void main(String[] args) {
	String s1 = "abcdecholhabca";
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	char c1;
	int j=0;
	int i=0;
	int max=0;
	for(;i<s1.length();i++) {
		c1 = s1.charAt(i);
		if(map.containsKey(c1)) {
			max = Math.max(max, (i - j));
			while(map.containsKey(c1)) {
				map.remove(s1.charAt(j));
				j++;
			}
		}
		map.put(c1,i);
	}
	max = Math.max(max, (i - j));
	System.out.println(max);
}
}



*/

