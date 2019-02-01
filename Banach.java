/* 
Assignment number    :    8.0 
File Name            :    Banach.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/
public class Banach {

	public static void main(String[]args) {
		// scale set for easier usage
		StdDraw.setXscale(0, 1000);
		StdDraw.setYscale(0, 1000);			
		
		// receive from user number of levels
		int n = Integer.parseInt(args[0]);

		banach(n);	
	}
	// auxiliary function
	private static void doCircle(int n, double x, double y, double r){

		StdDraw.circle(x, y, r);
		if (n == 1)
			return;
		double deg45 = Math.PI / 4;
		// draw middle circle
		doCircle(n - 1, x, y, r / 3);
		// draw 8 circles with 45 degree advancement
		// code written for easier understanding, can be 0 in first line
		doCircle(n - 1, x + r * Math.cos(0 * deg45), y + r * Math.sin(0 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(1 * deg45), y + r * Math.sin(1 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(2 * deg45), y + r * Math.sin(2 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(3 * deg45), y + r * Math.sin(3 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(4 * deg45), y + r * Math.sin(4 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(5 * deg45), y + r * Math.sin(5 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(6 * deg45), y + r * Math.sin(6 * deg45), r / 3);
		doCircle(n - 1, x + r * Math.cos(7 * deg45), y + r * Math.sin(7 * deg45), r / 3);

	}
	
	public static void banach (int n){
		doCircle(n, 500, 500, 250); 
	}
}


