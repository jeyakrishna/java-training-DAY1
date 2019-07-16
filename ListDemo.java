package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		
		//List<String> names = new ArrayList<>();
		List<String> names = new LinkedList<>();
		names.add("pavan");
		names.add("shantanu");
		names.add("shanti");
		names.add("john");
		names.add("nikhil");
		
		System.out.println(names);

		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
