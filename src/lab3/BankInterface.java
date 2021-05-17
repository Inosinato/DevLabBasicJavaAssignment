package lab3;

public interface BankInterface
{
	public default void getInterest()
	{
		System.out.println("Method from bank interface");
	}
}
