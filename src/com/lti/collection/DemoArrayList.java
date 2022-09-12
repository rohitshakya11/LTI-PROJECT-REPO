/**
 * 
 */
package com.lti.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 10710128
 *
 */
public class DemoArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// list is an interface which is implemented by arraylist

		// creation the object
		// we can type safe our collection using the generics <>
		List<String> al = new ArrayList<String>();
		System.out.println("size of collection: " + al.size());
		al.add("rohit");
		al.add("shakya");
		al.add("kumar");
		al.add("sk");
		al.add("rk");
		al.remove("rk");
		System.out.println("size of collection: " + al.size());

		// delete the value
		// we can delete the objects by index or by value

		al.remove(1);
		System.out.println("size of collection: " + al.size());
		System.out.println("details of collection: " + al);

		// list of collection iteration

		// Iterate the collection or list uisng for in ways

		// Iterable interface

		// Iterator is interface which is using to iterate the Collection
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {

			String test = i.next();
			System.out.println("detals of Capital------>" + test);
		}

		// Another way to iterate the collection using for loop

		// Loop through elements.
		for (String value : al) {

			System.out.println("Element: " + value);
		}

	}

}
