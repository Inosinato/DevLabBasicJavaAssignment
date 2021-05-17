package lab4;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelOrConsonant voc = new VowelOrConsonant();
		voc.letterType('y');
	}
	
	public void letterType(char a)
	{
		switch(a)
		{
			case 'a':
				System.out.println("char is vowel a");
				break;
				
			case 'e':
				System.out.println("char is vowel e");
				break;
				
			case 'i':
				System.out.println("char is vowel i");
				break;
				
			case 'o':
				System.out.println("char is vowel o");
				break;
				
			case 'u':
				System.out.println("char is vowel u");
				break;
				
			default:
				System.out.println("char is consonant");
				
		}
	}

}
