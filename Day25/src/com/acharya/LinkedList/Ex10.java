package com.acharya.LinkedList;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		LinkedList <String> st= new LinkedList<>();
		st.add("Rama");
		st.add("Sita");
		st.add("Vikas");
		st.add("Ravi");
		st.add("Vinay");
		System.out.println(st);
		st.removeFirst();
		System.out.println(st);
		st.removeLast();
		System.out.println(st);
		
		

	}

}
