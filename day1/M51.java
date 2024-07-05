package collections_app1;
/*
First Letter to Appear Twice




Example 1:

Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.



Example 2:

Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
 


*/

import java.util.HashMap;

public class M51 {
	public static void main(String[] args) {
		M51 obj = new M51();
		char repeatedChar = obj.repeatedCharacter("abcdd");
		System.out.println(repeatedChar);
	}
	
	public char repeatedCharacter(String s) {
		char c1 = s.charAt(0);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0;i<s.length();i++) {
			c1 = s.charAt(i);
			map.put(c1,  map.getOrDefault(c1, 0) + 1);
			if(map.get(c1) == 2) {
				break;
			}
		}
		return c1;
	}
}
