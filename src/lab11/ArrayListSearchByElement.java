package lab11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearchByElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> example = new ArrayList();
		example.add("first");
		example.add("second");
		
		int index = example.indexOf("first");
		

		if(example.contains("first"))
			System.out.println("Element 'first'  is present");
		else
			System.out.println("Element 'first'  is NOT present");
		
		
		System.out.println("Element " + example.get(index) + " is in index " + index);
		
	}

}
