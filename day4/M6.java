package Strings_app3;
//  Daily Temperatures

/*

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]



*/

import java.util.Arrays;
import java.util.Stack;

public class M6 {
	public static void main(String[] args) {
		M6 obj = new M6();
		int[] nums = {74, 75, 71, 68, 77, 73, 78};
		System.out.println(Arrays.toString(nums));
		System.out.println(obj.dailyTemperature(nums));
	}
	
	public int[] dailyTemperature(int[] temperatures) {
		int[] ans = new int[temperatures.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < temperatures.length;i++) {
			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				ans[stack.peek()] = i - stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		return ans;
	}
}
