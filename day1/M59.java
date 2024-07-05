package collections_app1;


/*

Two Sum



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]



*/


import java.util.Arrays;
import java.util.HashMap;

public class M59 {
	
	public static void main(String[] args) {
		M59 obj = new M59();
		int[] nums = {3,2,5,6,4,1,0};
		int target = 10;
		System.out.println(Arrays.toString(obj.twoSum(nums, target)));
	}
	
	
	
	
	public int[] twoSum(int[] nums, int target) {
		int[] result = {-1, -1};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				result[0] = i;
				result[1] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
