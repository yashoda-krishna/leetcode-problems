package Strings_app3;
// 26. Remove Duplicates from Sorted Array

/*


Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).




*/
public class M17 {
	
	    public int removeDuplicates(int[] nums) {
	        if (nums.length == 0) return 0;
	        
	        int k = 1; // Start from the second element
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }
	        return k;
	    }

	    public static void main(String[] args) {
	        M17 solution = new M17();
	        int[] nums = {0,0,1,1,1,2,2,3,3,4};
	        int k = solution.removeDuplicates(nums);
	        System.out.println(k); // Output: 5
	        for (int i = 0; i < k; i++) {
	            System.out.print(nums[i] + " "); // Output: 0 1 2 3 4
	        }
	    }
	}
