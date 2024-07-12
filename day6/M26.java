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

public class M26 {
	public static void main(String[] args) {
		M24 obj = new M24();
		int[] nums = {3, 1, 2, 7, 4, 10, 6, 77, 5};
		System.out.println("1st largest:" + obj.findKthLargest(nums, 1));
		System.out.println("2nd largest:" + obj.findKthLargest(nums, 2));
		System.out.println("3rd largest:" + obj.findKthLargest(nums, 3));
		System.out.println("4th largest:" + obj.findKthLargest(nums, 4));
		System.out.println("4th largest:" + obj.findKthLargest(nums, 7));
	}
	public int findKthLargest(int[] nums, int k) {
		int kthLargest = find(nums, 0, nums.length - 1, k);
		return kthLargest;
	}
	private int find(int[] nums, int left, int right, int k) {
		int pointer = left;        //3
		int pivot = right;         // 5
		for(int i = left; i < right;i++) {
			if(nums[i] > nums[pivot]) {
				swap(nums, i, pointer);
				pointer++;
			}
		}
		swap(nums, pointer, pivot);
		int rank = pointer - left + 1;
		if(rank == k) {
			return nums[pointer];
		}
		if(rank > k) {
			return find(nums, left, pointer - 1, k);
		}
		else {
			return find(nums, pointer + 1, right, k - rank);
		}
	}
	private void swap(int[] nums, int fromIndex, int toIndex) {
		int temp = nums[fromIndex];
		nums[fromIndex] = nums[toIndex];
		nums[toIndex] = temp;
	}
}