package test_app1;

class M8 {
	public static void main(String[] args) {
		int[][] nums = {
				{1,2,3,4,5},
				{11,12,13,14,15},
				{21,22,23,24,25},
				{31,32,33,34,35},
				{41,42,43,44,45}
		};
		int rs = 0;
		int re = nums.length - 1;
		int cs = 0;
		int ce = nums[0].length - 1;
		
		while(rs <= re && cs <= ce) {
			for(int i = cs ;i<=ce;i++) {
				System.out.print(nums[rs][i] + ",");
			}
			rs++;
			//2.reading from top to bottom
			for(int i = rs;i<=re;i++) {
				System.out.print(nums[i][ce] +",");
			}
			ce--;
			if(rs <= re) {
				for(int i = ce;i>=cs;i--) {{
					System.out.print(nums[re][i] +",");
				}
				re--;
			}
			if(cs <= ce) {
				for(int i = re;i>=rs;i--) {
					System.out.print(nums[i][cs] + ",");
				}
				cs++;
			}
		}
	}
	}
}

/*
54. Spiral Matrix

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

*/

