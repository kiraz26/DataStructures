package set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		SortedSet<String> sortedSet = new TreeSet<>();
		
		set.add("bc");
		set.add("aa");
		set.add("cc");
		set.add("cc");
		
		sortedSet.add("bc");
		sortedSet.add("aa");
		sortedSet.add("cc");
		sortedSet.add("cc");
		
		System.out.println(set);
		System.out.println(sortedSet);
	}

}
