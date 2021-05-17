package assignment2;

public class StringToCharArrAndViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Example of string";
		
		char[] c = s.toCharArray();
		
		System.out.println("String to char array");
		
		for (char d : c) {
			System.out.print(d);
		}
		
		System.out.println("");
		
		char [] c2 = {'E','x','a','m','p','l','e'};
		
		String s2 = new String(c2);
		
		System.out.println("Char array to String");
		System.out.println(s2);
		
	}

}
