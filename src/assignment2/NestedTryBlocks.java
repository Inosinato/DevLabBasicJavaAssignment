package assignment2;

public class NestedTryBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b;
		
		int [] arr = new int[1];

		try {
//			b = Integer.valueOf("10x");
			b = 1;
			try {
//				int c = b/a;
				int c = b * a;
				try {
					arr[2] = c;
				}
				catch(Exception e)
				{
					System.out.println("Third level exception");
					e.printStackTrace();
				}
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Second level exception");
				ae.printStackTrace();
			}
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("First level exception");
			nfe.printStackTrace();
		}
	}

}
