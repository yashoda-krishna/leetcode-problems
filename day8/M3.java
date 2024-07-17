package test_app1;
/*
 pascal triangle 
 
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */
import java.util.ArrayList;
import java.util.List;

public class M3 {
	public static void main(String[] args) {
		M3 obj = new M3();
		System.out.println(obj.generate(7));
	}
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		row.add(1);
		results.add(row);
		ArrayList<Integer> prevRow = row;
		for(int i = 1;i<numRows; i++) {
			row = new ArrayList<Integer>();
			row.add(1);
			for(int j = 1; j<i;j++) {
				row.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			row.add(1);
			results.add(row);
			prevRow = row;
		}
		return results;
	}
	
	/*
	public static void pascal(int n) {
		for(int i = 1; i < n ; i++) {
			for(int j = 01; j <=n - i ; j++) {
				System.out.print(" ");
			}
			int a = 1;
			for(int k = 1; k <= i; k++) {
				System.out.print(a + " ");
				a = a * (i - k) / k;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 7;
		pascal(n);
	}
	*/
}
