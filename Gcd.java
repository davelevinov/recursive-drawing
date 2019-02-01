/* 
Assignment number    :    8.0 
File Name            :    Gcd.java 
Name (First Last)    :    David Levinov  
Student ID           :    308152859
Email                :    davelevinov@gmail.com
*/

public class Gcd {
	public static void main(String[]args){
		
		// convert 2 numbers from user input to ints
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		System.out.println(gcd(first, second));
	}

	public static int gcd(int p, int q){
		// both equal - return either
		if (p == q)
			return p;
		// if q divides p completely
		if ((p > q) && (p % q == 0))
			return q;
		// if q divides p but with a remainder
		if ((p > q) && (p % q != 0))
			return gcd(p % q, q);
		//  if p divides q completely
		if ((q > p) && (q % p == 0))
			return p;
		// if p divides q with a remainder
		if ((q > p) && (q % p != 0))
			return gcd(q % p, p);
		// if no gcd, 1 divides both
		return 1;
	}
}
