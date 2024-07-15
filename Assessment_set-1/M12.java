package set_1;

import java.util.HashMap;
// 4
public class M12 {
	public static void main(String[] args) {
		System.out.println(longestSubStringWithATMostTWoChars("abacaabc"));
	}
	static int longestSubStringWithATMostTWoChars(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int leftPointer = 0;
		int longestSubstring = 0;
		char c1;
		int i = 0;
		for(; i < s.length();i++) {
			c1 = s.charAt(i);
			map.put(c1, map.getOrDefault(c1, 0) + 1);
			if(map.size() > 2) {
				longestSubstring = Math.max(longestSubstring, (i - leftPointer));
				
				while(map.size() > 2) {
					c1 = s.charAt(leftPointer);
					if(map.get(c1) > 1) {
						map.put(c1, map.get(c1) - 1);
					}else {
						map.remove(c1);
					}
					leftPointer++;
				}
			}
		}
		return longestSubstring;
	}
}
