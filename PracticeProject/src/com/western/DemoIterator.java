package com.western;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

	public static void main(String[] args) {
		List ll = new ArrayList<>();
		ll.add("Pune");
		ll.add(1);
		ll.add("Mumbai");
		
		Iterator itr = ll.iterator();
		//System.out.println(itr);
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
		while(itr.hasNext()) {
			Object obj = itr.next();
			if(obj.equals("Mumbai")) {
				itr.remove();
			}
			
			System.out.println(obj);
		}
		System.out.println("-----------------");
		for(Object ele : ll) {
			System.out.println(ele);
		}

		
	}

}
