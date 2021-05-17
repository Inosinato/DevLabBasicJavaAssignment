package lab10;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		    throw new MyException();
		    // throw is used to create a new exception and throw it.
		}
		catch(MyException e){
		 System.out.println(e) ;
		}
	}
}


class MyException extends Exception{	
	MyException() {
	  System.out.println("Personalized user exception");
	}
}
