package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// Set only allows unique elements
		// does not keep ordering

		Set<Integer> uniqueNums = new HashSet<>();
		uniqueNums.add(123);
		uniqueNums.add(234);
		uniqueNums.add(654);
		uniqueNums.add(654);
		System.out.println(uniqueNums);

		List<String> list = Arrays.asList("one", "one", "two", "three", "three", "four", "ten", "ten");
		System.out.println(list);

		Set<String> set = new HashSet<>(list);
		System.out.println(set);

		for (String str : set) {
			System.out.println(str.toUpperCase());

		}

	}

}
