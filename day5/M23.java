package Strings_app3;
//283. Move Zeroes

/*

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


*/

import java.util.Arrays;

public class M23 {
	public static void main(String[] args) {
		M23 obj = new M23();
		int[] nums = {0,1,4,0,0,0,0,3,0,4,0,0};
		System.out.println(Arrays.toString(nums));
		obj.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	public void moveZeroes(int[] nums) {
		int i = 0;
		for(int j = 0; j < nums.length;j++) {
			if(nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			}
		}
		for(int k = i; k < nums.length;k++) {
			nums[k] = 0;
		}
		
	}
}
