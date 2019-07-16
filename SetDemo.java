package collections;

import java.util.Set;
import java.util.HashSet;
//import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		//List<String> names = new ArrayList<>();
		Set<String> names = new HashSet<>();
		names.add("pavan");
		names.add("shantanu");
		names.add("shanti");
		names.add("john");
		names.add("nikhil");
		
		System.out.println(names);

		/*Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		
		for(String s : names) {
			System.out.println(s);
		}
		//names.stream().forEach(System.out::println);
		names.stream().forEach(s->System.out.println(s));
	}
}
