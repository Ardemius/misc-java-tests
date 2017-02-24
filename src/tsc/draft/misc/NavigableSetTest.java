package tsc.draft.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		myList.add(6);
		myList.add(5);

		NavigableSet<Integer> myNavigableSet = new TreeSet<Integer>();
		myNavigableSet.addAll(myList);
		for (Integer elt : myNavigableSet) {
			System.out.println("element of the NavigableSet = " + elt);
		}

	}

}
