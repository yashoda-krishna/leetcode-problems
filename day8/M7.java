package test_app1;

import java.util.Arrays;

/*
74. Search a 2D Matrix

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
*/

public class M7 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		for(int i = 0;i<m;i++) {
			if(matrix[i][0] >= target && matrix[i][n - 1] <= target) {
				for(int j = 0;j<n;j++) {
					if(matrix[i][j] == target) {
						return true;
					}
				}
			}
		}
		return false;
	}
}



/*



public class M4 {
	public static void main(String[] args) {

		int i = 0;
		int[][] results = new int[8][];
		int[] row = {1};
		results[i++] = row;
		int[] prevRow = row;
		for(; i < 8; i++) {
			row = new int[i + 1];
			row[0] = 1;
			for(int j = 1; j < i;j++) {
				row[j] = prevRow[j - 1] + prevRow[j];
			}
			row[row.length - 1] = 1;
			results[i] = row;
			prevRow = row;
		}
		
		for(int j = 0; j < results.length;j++) {
			System.out.println(Arrays.toString(results[j]));
		}
		
		
	}
}




*/
