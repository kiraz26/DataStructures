package set;

import java.util.HashSet;
import java.util.Set;

public class EmployeesSet {

	public static void main(String[] args) {

		Set<Employee> employees = new HashSet<>();
		employees.add(new Employee(123, "Shaun"));
		employees.add(new Employee(124, "Patel"));
		employees.add(new Employee(124, "Patel"));
		
		System.out.println(employees);
		
		
		
		
	}

}
