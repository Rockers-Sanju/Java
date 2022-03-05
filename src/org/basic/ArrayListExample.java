package org.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public void arrayListExample() {

		//syntax
		List<String> arrayList = new ArrayList<String>();

		// to add element .add
		arrayList.add("vijay");
		arrayList.add("ajith");
		arrayList.add("dhanush");
		arrayList.add("karthik");
		arrayList.add("surya");
		arrayList.add("dhanush");

		System.out.println(arrayList);

		// to get a particular element using index position
		System.out.println(arrayList.get(5));

		// to find a value indexOf by typing string
		System.out.println(arrayList.indexOf("dhanush"));

		// to find the last indexOf by typing string
		System.out.println(arrayList.lastIndexOf("dhanush"));

		// to create a duplicate list using addAll
		List<String> anotherarrayList = new ArrayList<String>();
		anotherarrayList.addAll(arrayList);
		System.out.println(anotherarrayList);

		// to clear the another list use clear command
		anotherarrayList.clear();
		System.out.println(anotherarrayList);

		// to remove the value or key using remove command

		arrayList.remove(3);
		System.out.println(arrayList);
		arrayList.remove("surya");
		System.out.println(arrayList);

		// to add null
		arrayList.add(null);
		System.out.println(arrayList);

		// to add whether element is there or not using isEmpty
		System.out.println(arrayList.isEmpty());

		// to replace a particular element using set command

		arrayList.set(0, "sanju");
		System.out.println(arrayList);

		// Iterate by for each

		for (String listout : arrayList) {
			System.out.println(listout);

		}
		System.out.println("-----for each----------");

		// Iterate by for

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));

		}
		System.out.println("------for loop---------");

		// Iterate using while (using Iterator syntax)

		// ListIterator

		ListIterator<String> listiterator = arrayList.listIterator();

		while (listiterator.hasNext()) {
			
			System.out.println(listiterator.next());

		}

		System.out.println("-------list iterator fwd--------");

		while (listiterator.hasPrevious()) {
			
			System.out.println(listiterator.previous());
		}
		
		System.out.println("------list iterator back---------");


		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()){
			
		System.out.println(iterator.next());
		}
		System.out.println("------iterator fwd---------");

	}

	public static void main(String[] args) {

		ArrayListExample example = new ArrayListExample();
		example.arrayListExample();

	}

}
