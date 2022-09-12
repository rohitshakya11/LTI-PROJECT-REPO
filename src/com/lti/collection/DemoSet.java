/**
*
*/
package com.lti.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 10710130
 *
 */
public class DemoSet {

	/**
	 * @param args
	 */

// set is an collection which won't allowed any duplicate element
// set implment various kind of classes like Hashset & Treeset
// Hashset contain the value in random order
// Treeset contain the value in sorting order

	public static void main(String[] args) {
// TODO Auto-generated method stub

		int count[] = { 34, 22, 10, 60, 30, 22 };

		Set set = new HashSet();

		try {
			for (int i = 0; i <= 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");

			System.out.println(sortedSet);

			System.out.println("The First element of the set is: " + (Integer) sortedSet.first());

			System.out.println("The last element of the set is: " + (Integer) sortedSet.last());

		} catch (Exception e) {

			System.out.println(" in exception Class" + e.getMessage());
		}

	}

}