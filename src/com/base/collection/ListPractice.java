package com.base.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPractice {

	public static void ArrayListMethod() {
		ArrayList< Object> al = new ArrayList<Object>();
		System.out.println(al.size());
		al.add("Yogesh");
		al.add("Ganesh");
		al.add("Priyansha");
		al.add("Nipte");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.add(2, 2);
		System.out.println(al);
		al.add(3, "3");
		System.out.println(al);

		/*
		 * for (String name : al) { System.out.println(name); }
		 */
	}
	public static void LinkedListMethod() {
		LinkedList <String> al = new LinkedList<String>();
		System.out.println(al.size());
		al.add("Yogesh");
		al.add("Ganesh");
		al.add("Priyansha");
		al.add("Nipte");
		/*
		 * for (String name : al) { System.out.println(name); }
		 */
		System.out.println(al);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListMethod();
		LinkedListMethod();
	}

}
