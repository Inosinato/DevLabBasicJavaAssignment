package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList();
		
		l.add("This");
		l.add("is");
		l.add("an");
		l.add("example");
		
		Collections.reverse(l);
		
		for(String s: l)
		{
			System.out.println(s);
		}
	}

}
