package test_app1;

/*

66. Plus One

Add to List

Share
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


*/

import java.util.Arrays;

public class M1 {
	public static void main(String[] args) {
		M1 obj = new M1();
		int[] nums = { 1,2,3,9};
		System.out.println(Arrays.toString(obj.plusOne(nums)));
		int[] nums1 = { 1,9,9};
		System.out.println(Arrays.toString(obj.plusOne(nums1)));
		int[] nums2 = { 1,5,6,8};
		System.out.println(Arrays.toString(obj.plusOne(nums2)));
	}
	
	
	public int[] plusOne(int[] digits) {
		for(int i = digits.length - 1; i >=0 ; i--) {
			if(digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] array = new int[digits.length + 1];
		array[0] = 1;
		return array;
	}
}
