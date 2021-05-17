package lab2;

public class DifferentVariableType {
	
	 public static int classVariable;
	    private int instanceVariable;
	    
	    public int getInstanceVariable() {
	        return instanceVariable;
	    }
	    public void setInstanceVariable(int instanceVariable) {
	        this.instanceVariable = instanceVariable;
	    }
	    
	    public void printVariableValues() {
	        int localVariable = 10;
	        
	        System.out.println("Local Variable: "+localVariable);
	        System.out.println("Class Variable: "+classVariable);
	        System.out.println("InstanceVariable "+instanceVariable);
	    }
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			classVariable = 12;
			DifferentVariableType dft = new DifferentVariableType();
			dft.setInstanceVariable(40);
			dft.printVariableValues();
		}

}
