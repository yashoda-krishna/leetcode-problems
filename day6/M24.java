package Strings_app3;
// 215. Kth Largest Element in an Array

/*


Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

*/

import java.util.Arrays;

public class M24 {
	public static void main(String[] args) {
		M24 obj = new M24();
		int[] nums = {0,4,8,1,4,9,2,12,1,77,99};	
		System.out.println(obj.findKthLargest(nums, 2));
	}
	
	 public int findKthLargest(int[] nums, int k) {
	        Arrays.sort(nums);
	        return nums[nums.length - k];
	    }
}
