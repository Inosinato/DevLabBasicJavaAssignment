package lab9;

public class ArrayOutOfBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {1,2,3};
		
		try {
			for(int i = 0 ; i < 4 ; i++)
			{
				System.out.println(numbers[i]);
			}
		}
		catch(IndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
			System.out.println("Print exception");
		}
		
		
	}

}
