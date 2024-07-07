package collections_app1;


/*

2390. Removing Stars From a String


Example 1:

Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".
Example 2:

Input: s = "erase*****"
Output: ""
Explanation: The entire string is removed, so we return an empty string.


*/

import java.util.ArrayList;

public class M92 {
	
	public static void main(String[] args) {
		M92 obj= new M92();
		System.out.println(obj.removeStars("leet**cod*e"));
	}
	public String removeStars(String s) {
		int index;
		char c1;
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(c1 == '*') {
				list.remove(list.size() - 1);
				continue;
			}
			list.add(c1);
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}




/*


public class M91 {
	public static void main(String[] args) {
		M91 obj = new M91();
		System.out.println(obj.removeStars("leet**cod*e"));
	}
	
	public String removeStars(String s) {
		int index;
		while((index = s.indexOf('*')) != -1) {
			s = s.substring(0, index) + s.substring(index + 1);
			index = s.indexOf('*');
		}
  return s;	
}
}




*/


