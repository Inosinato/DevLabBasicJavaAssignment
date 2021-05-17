package loopsExamples;

public class DoWhileDemo {
	public static void main(String[] args) 
    {
        int i=20;
        //one iteration is guaranteed
        do{
            System.out.print(" "+i);
            i--;
        } while(i>0);
    }
}
