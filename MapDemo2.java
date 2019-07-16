package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	
	public static void main(String args[]) {
		Map<Integer, Emp> empdata = new HashMap<>();
		empdata.put(100, new Emp(100, "John", "London", 45000));
		empdata.put(101, new Emp(101, "Scott", "London", 48000));
		empdata.put(102, new Emp(102, "Karl", "Oslo", 78000));
		empdata.put(103, new Emp(103, "Krish", "Mumbai", 80000));
		empdata.put(104, new Emp(104, "Amit", "Hyderabad", 98000));
		empdata.put(105, new Emp(105, "Srinu", "Vizag", 78000));
		empdata.put(106, new Emp(106, "Kirti", "London", 48000));
		empdata.put(107, new Emp(107, "Deepa", "London", 48000));
		empdata.put(108, new Emp(108, "Mary", "NewYork", 48000));
		empdata.put(109, new Emp(109, "Scott", "London", 48000));
		
		System.out.println(empdata);//hashMap has its own toString implementation....
		
		Set<Integer> keys = empdata.keySet();
		
		for(Integer key : keys) {
			Emp e = empdata.get(key);
			System.out.println(e);//passing the reference of the object where it calls toString....
			/*
			if (e.getCity().equals("London")) {
			System.out.println(key + " ----> [" + e.getEmpId()+" "+ e.getName() + " "+ e.getCity()+ " "+ e.getSalary() + "]");
			}
			*/
		}
	}

}
