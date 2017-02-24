package tsc.draft.misc;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		st.findInLineTest();
		st.useDelimiterTest();
	}

	private void findInLineTest() {
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input);
		String findInLine = s
				.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
		System.out.println("findInLine = " + findInLine);
		MatchResult result = s.match();
		for (int i = 1; i <= result.groupCount(); i++)
			System.out.println(result.group(i));
		s.close();
	}

	private void useDelimiterTest() {
		String input = "10 apples 20 oranges 33 pears";
		Scanner s = new Scanner(input);
		s.useDelimiter("\\d*");
		String[] str = new String[50];
		int i = 0;
		while (s.hasNext()) {
			str[i] = s.next();
			System.out.println("str[i] = " + str[i]);
		}
		s.close();
	}

}
