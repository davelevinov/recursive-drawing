/* 
Assignment number    :    8.0 
File Name            :    Multiply.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Multiply {	
	
	public static void main(String[]args){
		
		// convert 2 numbers from user input to ints
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		System.out.println(multiply(first, second));
	}
	public static int multiply(int a, int b){
		if (b == 0)
			return 0;		
		// add to first number itself b-1 times
		return a + multiply(a, b-1);
	}
}
	
