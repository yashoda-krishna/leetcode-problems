package Strings_app3;
// 2733. Neither Minimum nor Maximum

/*

Example 1:

Input: nums = [3,2,1,4]
Output: 2
Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
Example 2:

Input: nums = [1,2]
Output: -1
Explanation: Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.
Example 3:

Input: nums = [2,1,3]
Output: 2
Explanation: Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer. 
 



*/

import java.util.Arrays;

public class M21 {
	public static void main(String[] args) {
		int[] nums1= {1,2,3,4,5,6};
		M21 obj = new M21();
		System.out.println(obj.findNorMinOrMax(nums1));
	}
	public int findNorMinOrMax(int[] nums) {
		int k =0;
		if(nums.length <= 2) {
			return k = -1;
		}
		Arrays.sort(nums);
		return k=nums[1];
	}
}

/*

class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] != nums[0] && nums[i] != nums[nums.length - 1]){
                k = nums[i];
            }
            else if(nums.length <=2){
                return k = -1;
            }
        }
        return k;
    }
}


*/
