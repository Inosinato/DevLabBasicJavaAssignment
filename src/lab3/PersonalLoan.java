package lab3;

public class PersonalLoan implements BankInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalLoan pl = new PersonalLoan();
		BusinessLoan bl = new BusinessLoan();
		pl.getInterest();
		bl.getInterest();
		
	}

	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		System.out.println("personal interest");
	}

}
