package com.western;

import java.util.ArrayList;
import java.util.Iterator;

public class Demoiterator1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>(); 
		
		for(int i=0; i<=10; i++) {
			l.add(i);
		}
		Iterator<Integer> itr = l.iterator();
		System.out.println("List before removal");
		for(Integer num : l) {
			System.out.print(num+ " ");
		}
		
		while(itr.hasNext())
		{
//			itr.next();
//			itr.remove();
			if(itr.next()%2 != 0) {
				itr.remove();
			}
		}
		
		 System.out.println("\nList after removal");
		 
		 for(Integer num : l) {
				System.out.print(num+ " ");
			}
        

	}

}
