package test_app1;

/*
1004. Max Consecutive Ones III
Medium

8581

134

Add to List

Share
Given a binary array nums and an integer k, return the maximum number of consecutive 1's 
in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*/

public class M20 {
	public static void main(String[] args) {
		int[] nums = {0,1,0,1,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1};
		int p = 0;
		int i = 0;
		int zeros = 0;
		int max = Integer.MIN_VALUE;
		int k = 2;
		for( i = 0; i<nums.length;i++) {
			if(nums[i] == 0) {
				zeros++;
			}
			if(zeros <= k) {
				max = Math.max(max, (i - p + 1));
			}
			else {
				while(zeros > k) {
					if(nums[p] == 0) {
						zeros--;
					}
					p++;
				}
			}
		}
		max = Math.max(max, i - p);
		System.out.println(max);
	}
}
