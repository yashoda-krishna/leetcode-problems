package collections_app1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A2 {
public static void main(String[] args) {
	String s1 = "care";
	char[] c1 = s1.toCharArray();
	Arrays.sort(c1);
	s1 = new String(c1);
	
	String s2 = "race";
	char[] c2 = s2.toCharArray();
	Arrays.sort(c2);
	s2 = new String(c2);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.equals(s2));
	
	
}
}
