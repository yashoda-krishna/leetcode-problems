package test_app1;

public class M2 {
	public static void main(String[] args) {
		M2 obj = new M2();
		int[] nums = {1,4,6,7,9};
		int k = 7;
		System.out.println(obj.searchInsert(nums, k));
	}
	public int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		int mid;
		while(left <= right) {
			mid = (left + right) / 2;
			if(nums[mid] == target) {
				System.out.println(mid);
				return mid;
			}
			else if (target > nums[mid]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return left;
	}
}
