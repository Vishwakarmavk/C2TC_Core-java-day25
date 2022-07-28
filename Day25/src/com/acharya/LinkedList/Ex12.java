package com.acharya.LinkedList;
import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
	  LinkedList<String> l1= new LinkedList<>(); 	
		l1.add("Rama");
		l1.add("Sita");
		l1.add("Vikas");
		l1.add("Ravi");
		l1.add("Vinay");
		Iterator i = l1.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
