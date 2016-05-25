package com.tutorialspoint;

import java.util.*;

public class StackDemo {
	public static void main(String args[]) {
		// creating stack
		Stack st = new Stack();

		// populating stack
		st.push("Kongao");
		st.push("Source");
		st.push("code");
		st.push("last");
		st.push("Kongao");
		st.push("Source");
		st.push("code");
		st.push("last");
		st.push("Kongao");
		st.push("Source");
		st.push("code");
		st.push("last");
		st.push("Kongao");
		st.push("Source");
		st.push("code");
		st.push("last");

		// checking the top object
		System.out.println("Top object is: " + st.peek());

		// removing top object
		System.out.println("Removed object is: " + st.pop());

		// elements after remove
		System.out.println("Elements after remove: " + st);

	}
}