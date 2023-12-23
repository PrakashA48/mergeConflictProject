package com.western;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedhashset {

	public static void main(String[] args) {
		Set<Integer> ss = new LinkedHashSet<Integer>();
		ss.add(12);
		ss.add(13);
		ss.add(14);
		ss.add(15);
		System.out.println("List before removal");

		for (Integer num : ss) {
			System.out.println(num);
		}
		Iterator<Integer> itr = ss.iterator();

		// System.out.println(itr.hasNext());
		System.out.println("List after removal");
		while (itr.hasNext()) {

//			Object obj = itr.next();
//			itr.remove();
			if (itr.next() % 2 == 0) {
				itr.remove();
			}

		}

		for (Integer num : ss) {
			System.out.println(num);
		}

	}

}
