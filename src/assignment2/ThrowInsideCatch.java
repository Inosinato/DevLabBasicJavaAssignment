package assignment2;

public class ThrowInsideCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            throw new java.io.IOException();
	        } catch (java.io.IOException exc) {
	            System.err.println("In catch IOException: "+exc.getClass());
	            throw new RuntimeException();
	        } catch (Exception exc) {
	            System.err.println("In catch Exception: "+exc.getClass());
	        }
	}

}
