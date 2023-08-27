package stack;

import java.util.Stack;

public class stack_demo {

	 public static void main(String args[])
	    {
		 Stack<String> animals = new Stack<>();
		 animals.push("Dog");
		 animals.push("Cat");
		 animals.push("Tiger");
		 animals.push("Lion");

		 System.out.println(animals);
		 System.out.println(animals.peek());
		 animals.pop();
		 System.out.println(animals);
	    }
	
}
