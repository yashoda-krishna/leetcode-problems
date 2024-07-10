package Strings_app3;
// 628. Maximum Product of Three Numbers


/*



Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6


*/

import java.util.Arrays;

public class M15 {
	public static void main(String[] args) {
		M15 obj = new M15();
		int[] nums1 = {12,4,1,9,5,3,2};
		int[] nums2 = {-20, -15, 12, 4, 1,9,5,3,2};
		int[] nums3 = { -20, 12, 4, 1, 9, 5, 3, 2};
		
		System.out.println(obj.maximumProduct(nums1));
		System.out.println(obj.maximumProduct(nums2));
		System.out.println(obj.maximumProduct(nums3));
		}
	
	
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		/*
		int product1 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
		int product2 = nums[0] * nums[1] * nums[nums.length - 1];
		int maxProduct = Math.max(product1, product2);
		return maxProduct;
		*/
		
		int product1 = nums[nums.length - 1];
		int product2 = nums[nums.length - 2];
		int product3 = nums[nums.length - 3];
		int maxProduct = product1 * product2 * product3;
		
		return maxProduct;
	}
}