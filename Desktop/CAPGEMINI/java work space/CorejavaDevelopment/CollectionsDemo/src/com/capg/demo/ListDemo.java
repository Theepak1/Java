package com.capg.demo;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	
		public static void main(String[] args) {
			
			
			Integer  i = new Integer(5);
					
			
			List<Integer> list = new LinkedList<Integer>();	//new ArrayList<Integer>();
			
			
				System.out.println(list.add(new Integer(4)));
				list.add(new Integer(7)); // new Integer(7)
				list.add(9);
				System.out.println(list.add(4));
			
				
				System.out.println(list);
			
			
			
			
		}
	
	
	
}
