package set_1;
//        abbcyyzcc
//		  abbcyyzbbccaqrr
import java.util.ArrayList;

public class M17 {
	public static void main(String[] args) {
		System.out.println(removeTriplets("aaabbcxxxyyzbbbcca"));
		System.out.println(removeTriplets("aaabbcxxxyyzbbccapppqrrsss"));
	}
	
	static String removeTriplets(String s) {
		ArrayList<Character> list = new ArrayList<Character>();
		if(s.length() == 0) {
			return s;
			
		}
		char c1 = s.charAt(0);
		list.add(c1);
		for(int i = 0; i < s.length() - 1;i++) {
			c1 = s.charAt(i);
			if(list.size() > 0 && list.get(list.size() - 1) == c1 && c1 == s.charAt(i + 1)) {
				list.remove(list.size() - 1);
				i++;
				continue;
			}
			list.add(c1);
		}
		String result = "";
		for(int i = 0; i < list.size(); i++) {
			result += list.get(i);
		}
		return result;
	}
}
