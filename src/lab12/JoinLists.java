package lab12;

import java.util.ArrayList;
import java.util.List;

public class JoinLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList();
		list1.add("first");
		list1.add("second");
		
		List<String> list2 = new ArrayList();
		list2.add("third");
		list2.add("fourth");
		
		list1.addAll(list2);
		
		for(String s: list1){
			System.out.println(s);
		}
	}

}
