package com.acharya.collectionarr;
import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		List <String> st =new ArrayList<>();
		st.add("one piece ");
		System.out.println(st);
		List <String> st1 =new ArrayList<>();
		st.add("is ending bro");
		st.addAll(st1);
		System.out.println(st);
		System.out.println(st1);

	}

}
