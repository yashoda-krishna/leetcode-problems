package test_app1;

/*
59. Spiral Matrix II



Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]

*/

public class M11 {
	public int[][] generateMatrix(int n){
		int element = 1;
		int[][] results = new int[n][n];
		
		int rs = 0;
		int re = n - 1;
		int cs = 0;
		int ce = n - 1;
		while(rs <= re && cs <= ce) {
			for(int i = cs; i<= ce;i++) {
				results[rs][i] = element++;
			}
			rs++;
			for(int i = rs;i<= re;i++) {
				results[i][ce] = element++;
			}
			ce--;
			for(int i = ce;i>=cs;i--) {
				results[re][i] = element++;
			}
			re--;
			for(int i = re;i>=rs;i--) {
				results[i][cs] = element++;
			}
			cs++;
		}
		return results;
	}
}
