/* 
Assignment number    :    8.0 
File Name            :    Sierpinski.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Sierpinski {
		public static void main(String[]args) {
			
			// scale set for usage comfort
			StdDraw.setXscale(0, 1000);
			StdDraw.setYscale(0, 1000);	
			
			// receive amount of levels from user input
			int n = Integer.parseInt(args[0]);
			sierpinski(n);	
		}
	
		// auxiliary to draw an equilateral triangle
		private static void drawEquilateral(double x0, double x1, double y){
			
			// left corner to right 
			StdDraw.line(x0, y, x1, y);
			// right corner to top
			StdDraw.line(x1, y, x1 - (x1 - x0) / 2, y + Math.sqrt(3) * ((x1 - x0) / 2));
			// top to left corner
			StdDraw.line(x1 - (x1 - x0) / 2, y + Math.sqrt(3) * ((x1 - x0) / 2), x0, y);
		}
		// auxiliary to draw 3 triangles
		private static void doTriangle(int n, double x0, double x1, double y){
		
			drawEquilateral(x0, x1, y);
			if (n == 1)
				return;
			// left triangle
			doTriangle(n - 1, x0, x0 + (x1 - x0) / 2, y);
			// top triangle
		    doTriangle(n - 1, x0 + (x1 - x0) / 4, x0 + ((x1 - x0) * .75),
		    						y + Math.sqrt(3) * ((x1 - x0) * 0.25));
			// right triangle
			doTriangle(n - 1, (x1 + x0) / 2, x1, y);					
	
		}
		
		public static void sierpinski (int n){
			doTriangle(n, 0, 1000, 0);
				    
		}
}
