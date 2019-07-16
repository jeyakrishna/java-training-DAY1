package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String args[]) {
		Map<Integer, String> empdata = new HashMap<>();
		empdata.put(100, "John");
		empdata.put(101, "Scott");
		empdata.put(102, "Karl");
		empdata.put(103, "Krish");
		empdata.put(104, "Amit");
		empdata.put(105, "Srinu");
		empdata.put(106, "Kirti");
		empdata.put(107, "Deepa");
		empdata.put(108, "Mary");
		empdata.put(109, "Scott");
		
		System.out.println(empdata);
		
		Set<Integer> keys = empdata.keySet();
		
		for(Integer key : keys) {
			System.out.println(key + " ----> " + empdata.get(key));
		}
	}

}
