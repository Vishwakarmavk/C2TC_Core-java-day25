package com.acharya.LinkedList;
import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<>();
		l.add("Rama");
		l.add("Sita");
		l.add("Vikas");
		l.add("Ravi");
		l.add("Vinay");
		System.out.println(l);
		String s = "Ravi";
		boolean b = l.contains(s);
		System.out.println(b);
		if(b)
		{
			System.out.println(l.indexOf(s));
		}
		

	}

}
