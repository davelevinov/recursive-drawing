/* 
Assignment number    :    8.0 
File Name            :    MaxPath.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class MaxPath {
	public static void main(String[]args){
		
		// read from user input matrix dimension
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int [][] matrix = new int[m][n];
		int [][] memo = new int [m][n];
		// index for reading numbers from user input
		int argsindex = 2;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++) {
				matrix [i][j] = Integer.parseInt(args[argsindex++]);
				memo [i][j] = -1;
			}
		}
		
		System.out.println(effMaxPath(matrix, memo));
		System.out.println(maxPath(matrix));

		}
	
	public static int maxPath(int [][] arr){
		
		return getMaxSumToEnd(arr, 0, 0);
	}
	
	private static int getMaxSumToEnd(int [][] arr, int i, int j){
		if (i >= arr.length || j >= arr[0].length)
			return 0;		
		return arr[i][j] + Math.max(getMaxSumToEnd(arr, i + 1, j),
									getMaxSumToEnd(arr, i, j + 1));		
	}	

	public static int effMaxPath(int [][] arr, int [][] memo){
		
		return effSumToEnd(arr, memo, 0, 0);
	}
	
	private static int effSumToEnd(int [][] arr, int [][] memo, int i, int j){
		if (i >= arr.length || j >= arr[0].length)
			return 0;
		
		if (memo[i][j] == -1){
			memo[i][j] = arr[i][j] + Math.max(effSumToEnd(arr, memo, i + 1, j),
					effSumToEnd(arr, memo, i, j + 1));
		}
		return memo[i][j];
	}
}