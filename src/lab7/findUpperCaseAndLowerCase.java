package lab7;

public class findUpperCaseAndLowerCase {
	
	static String characters ="AbCdefGHijklMNOpqRstUVwxyZ@%*234";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Upper Case chars");
		upperCase();
		
		System.out.println("Lower Case chars");
		lowerCase();
	}

	public static void upperCase() {
		for(char a:characters.toCharArray())
		{
			if(Character.isUpperCase(a)) {
				System.out.println(a);
			}
		}
	}
	
	public static void lowerCase() {
		for(char a:characters.toCharArray())
		{
			if(Character.isLowerCase(a)) {
				System.out.println(a);
			}
		}
	}
}
