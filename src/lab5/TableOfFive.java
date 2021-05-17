package lab5;

public class TableOfFive {
	
	public void multiply()
	{
		for(int a = 1; a <10 ; a++)
		{
			System.out.println(a * 5);
		}
	}
	
	
	public static void main(String[] args)
	{
        TableOfFive tof = new TableOfFive();
        tof.multiply();
	}
}
