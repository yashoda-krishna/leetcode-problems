package set_1;

import java.util.Arrays;

public class M19 {
		public static void main(String[] args) {
			int[] nums1 = {4,7,1,9,2,8,3,2,0,-10,-30};
			int[] nums2 = {4,7,1,9,2,8,3,2,0,-10,-30};
			int[] nums3 = {4,7,1,9,2,8,3,2,0,-10,-30};
			int[] nums4 = {4,7,1,9,2,8,3,2,0,-10,-30};
			System.out.println(maxProductOfFourNumber(nums1));
		}
		static int maxProductOfFourNumber(int[] nums) {
			Arrays.sort(nums);
			int max1 = nums[nums.length - 4] *
					   nums[nums.length - 3] *
					   nums[nums.length - 2] *
					   nums[nums.length - 1];
			int max2 = nums[0] *
					   nums[1] *
					   nums[nums.length - 2] *
					   nums[nums.length - 1];
			int max3 = nums[0] *
					   nums[1] *
					   nums[2] *
					   nums[3];
			max1 = Math.max(max1, max2);
			max1 = Math.max(max1, max3);
			return max1;
		}
}
