package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int arr[] = { 23, 54, 6, 56, 76, 878, 9 };
		List<Integer> list = new ArrayList<>(); 
				Arrays.asList(23, 54, 6, 56, 76, 878, 9);
		list.add(23);
		list.add(54);
		list.add(6);
		list.add(56);
		list.add(76);
		list.add(878);
		list.add(9);
	
		for (int n : arr) {
			System.out.println(n);
		}

		for (int n : list) {
			System.out.println(n);
		}
		System.out.println("===============================");
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			it.remove();
			
		}
		
		System.out.println(list);
		
		System.out.println("===============================");
		for (Integer n : list) {
			System.out.println(n);
			//list.remove(n);
		}

	}
}
