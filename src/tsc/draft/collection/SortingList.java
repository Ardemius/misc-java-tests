package tsc.draft.collection;

import java.util.Arrays;
import java.util.List;

public class SortingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a[] = { 12, 5, 333, 2, 221, 0, 00 };
		Arrays.sort(a);
		List l = Arrays.asList(a);
		int in = Arrays.binarySearch(a, 12);
		System.out.println("in = " + in);
	}

}
