package map;

import java.util.HashMap;
import java.util.Map;

public class MapsAnotherExample {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		System.out.println(map);
		// key is Sweden
		// value is SW
		map.put("Sweden", "SW");
		System.out.println(map);
		// key is Canada
		// value is CA
		map.put("Canada", "CA");
		System.out.println(map);
		// Duplicate cannot be written in MAP
		map.put("Sweden", "SW");
		System.out.println(map);
		System.out.println("-----------------------");
		System.out.println(map.get("Canada"));
		System.out.println(map.get("Italy"));

		System.out.println("---------------------");
		// map.keySet() : returns the keys in the map
		System.out.println(map.size());
		System.out.println(map.keySet().size());

		for (String key : map.keySet()) {
			System.out.println("Key  : " + key);
			System.out.println("Value: " + map.get(key));
			System.out.println("==============");
		}

		Map<String, String> person1 = new HashMap<>();
		person1.put("name", "Ronaldinho");
		person1.put("age", "27");
		person1.put("city", "Santos");

		Map<String, String> person2 = new HashMap<>();
		person2.put("name", "Xavi");
		person2.put("age", "28");
		person2.put("city", "Barcelona");

		System.out.println(person1);
		System.out.println(person2);

	}
}
