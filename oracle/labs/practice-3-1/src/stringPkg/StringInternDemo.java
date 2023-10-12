package stringPkg;

public class StringInternDemo{
	public static void main(String[] args){
	
		// refers to Object in SCP Area.
		// SCP (String Constant Pool) - SCP is used to store constant strings:
		String teaTxt = "Tea";  
		String b = teaTxt.intern();
		
		// Comparing memory locations
		// teaTxt is in SCP
		// b is in SCP
		System.out.println(teaTxt == b); // true
		
		// refers to Objects in Heap Area.
		// Heap - Temporary Memory Area:
		// The Heap is used to store dynamic objects and data in Java, such as objects 	
		// created using "new."
		
		String c = new String("Tea");
	
		System.out.println(teaTxt == c); // false
		
		// Comparing only values
        	System.out.println(teaTxt.equals(c)); // true
        	
        	/*
        	Stack:
			The stack is a region of memory used for managing the execution of a program. It keeps track 
			of function call information, local variables, and control flow
			The stack is used for managing the execution flow
        	*/
        	
	}

}
