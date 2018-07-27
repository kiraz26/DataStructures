package lists;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector is syncronized
		Vector<String> vector = new Vector<>();
		vector.add("apples");
		System.out.println(vector);
		
		vector.addElement("banana");
		System.out.println(vector);

	}

}
