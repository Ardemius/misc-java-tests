package tsc.draft.misc;

import java.util.ArrayList;

public class ToArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("1");
		Object[] array = a.toArray();
		for (Object object : array) {
			System.out.println(object);
		}

	}

}
