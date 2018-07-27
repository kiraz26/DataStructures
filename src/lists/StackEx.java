package lists;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// LIFO
		
		Stack<String> stack =new Stack<>();
		stack.push("java");
		stack.push("OCA");
		stack.push("Selenium Cookbook");
		stack.push("10X");
		System.out.println(stack.peek()); // --> 10X
		System.out.println(stack);
		System.out.println(stack.search("java"));
		
		
	}

}
