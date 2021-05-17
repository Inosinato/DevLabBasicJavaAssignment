package lab1;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3 , b = 6;
		int c = ++a * b--;
		
		System.out.println("The value of a is: " + a );
		System.out.println("The value of b is: " + b );
		System.out.println("The value of c is: " + c );
		System.out.println("");
	
		int m = 3 , n = 6, o = 7, p = 12;
		int r = m++ * --n + p++ * ++o;
		
		System.out.println("The value of m is: " + m );
		System.out.println("The value of n is: " + n );
		System.out.println("The value of o is: " + o);
		System.out.println("The value of p is: " + p );
		System.out.println("The value of r is: " + r );

		
	}

}
