package collections_app1;

/*

350. Intersection of Two Arrays II


Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M63 {
	
	
	public static void main(String[] args) {
		M63 obj = new M63();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] commonElements = obj.intersect(nums1, nums2);
		System.out.println(Arrays.toString(commonElements));
	}
	
	 public int[] intersect(int[] nums1, int[] nums2) {
     	
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i=0; i < nums1.length; i++) {
				map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
			}
			
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < nums2.length;i++) {
				if(map.containsKey(nums2[i])) {
					list.add(nums2[i]);
					if(map.get(nums2[i]) > 1) {
						map.put(nums2[i], map.get(nums2[i]) - 1);
					}
					else {
						map.remove(nums2[i]);
					}
				}
			}
	        
	        int[] results = new int[list.size()];
	        for(int i = 0; i < list.size();i++) {
	            results[i] = list.get(i);
	        }
	        return results;
	    }
}


/*

public class M62 {
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < nums2.length;i++) {
			if(map.containsKey(nums2[i])) {
				list.add(nums2[i]);
				if(map.get(nums2[i]) > 1) {
					map.put(nums2[i], map.get(nums2[i]) - 1);
				}
				else {
					map.remove(nums2[i]);
				}
			}
		}
		System.out.println(list);
	}
}

*/
