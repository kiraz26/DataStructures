package warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCodeEx {

	public static void main(String[] args) {
		Employee emp1 = new Employee(500);
		Employee emp2 = new Employee(100);
		Employee emp3 = new Employee(110);

		List list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		Collections.sort(list);

		for (Object object : list) {
			System.out.println(object);
		}

		System.out.println(emp1.equals(emp2));

		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

		// Integer i1 = new Integer(100);
		// Integer i2 = new Integer(100);
		// System.out.println(i1.hashCode());
		// System.out.println(i2.hashCode());

		Set<Employee> set = new HashSet<>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);

		System.out.println(set.size());

	}

}

class Employee implements Comparable<Employee> {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.id > emp.id) {
			return 1;
		} else if (this.id > emp.id) {
			return -1;
		}
		return 0;

	}

	@Override
	public String toString() {
		return id + "";
	}
}