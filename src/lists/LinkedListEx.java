package lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> linkedL = new LinkedList<>();
		linkedL.add("John");
		linkedL.add("Vijay");
		linkedL.add("Bob");
		linkedL.add("Mark");
		System.out.println(linkedL.size() + " : " + linkedL);

		System.out.println(linkedL.indexOf("Vijay"));

		LinkedList<String> linkedLL = (LinkedList) linkedL;
		linkedLL.addFirst("Epson");
		System.out.println(linkedLL);

		linkedLL.addLast("Logi");
		System.out.println(linkedLL);

		linkedLL.add(1, "Apple");
		System.out.println(linkedLL);

		linkedLL.removeFirst(); // if list is emtpy, it will throw exception
		System.out.println(linkedLL);

		linkedLL.poll(); // will not throw exception
		System.out.println(linkedLL);

		System.out.println(linkedLL.peekFirst());
		System.out.println(linkedLL.peekLast());
		System.out.println(linkedLL);

		System.out.println(linkedLL.pollFirst());
		System.out.println(linkedLL);

		System.out.println(linkedLL.get(2));
		
		
	
	
	
	}

}
