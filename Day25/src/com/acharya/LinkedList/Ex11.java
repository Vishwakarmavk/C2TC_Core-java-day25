package com.acharya.LinkedList;
import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<>();
           l1.add("Rama");
   		l1.add("Sita");
   		l1.add("Vikas");
   		l1.add("Ravi");
   		l1.add("Vinay");
   		l1.add("Rama");
   		System.out.println(l1);
   		l1.removeFirstOccurrence("Rama");
   		System.out.println(l1);
   		l1.removeLastOccurrence("Rama");
   		System.out.println(l1);
	}

}
