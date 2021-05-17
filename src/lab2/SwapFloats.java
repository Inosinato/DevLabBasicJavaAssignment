package lab2;

public class SwapFloats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float f1 = 2.323f, f2 = 3.43232f, temp;
		temp = f1;
		
		System.out.println("Before swap f1: " + f1);
		System.out.println("Before swap f2: " + f2);
		
		f1 = f2;
		f2 = temp;
		
		System.out.println("After swap f1: " + f1);
		System.out.println("After swap f2: " + f2);

	}

}
