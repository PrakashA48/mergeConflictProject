package com.western;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
//https://www.geeksforgeeks.org/how-to-remove-an-element-from-collection-using-iterator-object-in-java/
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();

		l.add("January");
		l.add("February");
		l.add("March");
		l.add("April");
		l.add("May");
		l.add("June");
		l.add("July");
		l.add("August");

		ListIterator<String> itr = l.listIterator();
		System.out.println("List before removal");
		for (String month : l) {
			System.out.print(l + " ");
			break;
		}

		while (itr.hasNext()) {
			if (itr.next().equals("June")) {
				itr.remove();
			}
		}

		System.out.println("\nList after removal");

		for (String month : l) {
			System.out.print(l + " ");
			break;
		}

	}

}
