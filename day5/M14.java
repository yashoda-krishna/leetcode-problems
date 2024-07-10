package Strings_app3;
//268. Missing Number


/*

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
8 is the missing number in the range since it does not appear in nums.

*/

public class M14 {
	public static void main(String[] args) {
		M14 obj = new M14();
		int [] nums3 = {0,4,1,2};
		System.out.println(obj.missingNumber(nums3));
	}
	public int missingNumber(int[] nums) {
		int max = Integer.MIN_VALUE;
		int actualSum = 0;
		for(int i = 0; i<nums.length;i++) {
			actualSum += nums[i];
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		int naturalSum = max * (max + 1) / 2;
		int diff = naturalSum - actualSum;
		int missedNum = diff != 0 ? diff : (max == nums.length ? (max + 1) : diff);
		return missedNum;
	}
}
/*




int sum=0;
		int[] array = {1,2,3,4,7,6,5};
		int arraySum = 0;
		for(int i = 0;i<array.length + 1;i++) {
			sum = sum + i;
		}
		for(int i = 0; i< array.length;i++) {
			arraySum = arraySum + array[i];
		}
		System.out.println(sum);
		System.out.println(arraySum);
		if(sum == arraySum) {
			System.out.println(sum - arraySum);
		}
		else {
			System.out.println(0);
		}





*/
