package set_1;
/*
	2
	2
	3	
		
*/		
public class M14 {
	public static void main(String[] args) {
		int[] nums1 = {0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,0,0};
		System.out.println(minConsecutiveOnes(nums1));
		int[] nums2 = {0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,0};
		System.out.println(minConsecutiveOnes(nums2));
		int[] nums3 = { 0,0,0,0,0,1,1,1,0,1,1,1,1,1};
		System.out.println(minConsecutiveOnes(nums3));
	}
	static int minConsecutiveOnes(int[] nums) {
		int minCount = Integer.MAX_VALUE;
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				count++;
			}else {
				if(count != 0) {
					minCount = Math.min(minCount, count);
				}
				count = 0;
			}
		}
		if( count != 0) {
			minCount = Math.min(minCount, count);
		}
		minCount = minCount == Integer.MAX_VALUE ? 0 : minCount;
		return minCount;
	}
}
