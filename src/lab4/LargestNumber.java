package lab4;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber ln = new LargestNumber();
		ln.findLargest(4, 2, 13);
	}
	
	public void findLargest(int a, int b, int c)
	{
		if(a > b)
		{
			if(a > c)
			{
				System.out.println(a + " is the largest number");
			}
			else
				System.out.println(c + " is the largest number");
		}
		else if(b > c)
		{
			System.out.println(b + " is the largest number");
		}
			
	}

}
