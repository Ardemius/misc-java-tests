package tsc.draft.misc;

import java.util.Arrays;

public class StringTest {

	String s3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTest stringTest = new StringTest();
		stringTest.test1();
		stringTest.test2();
		stringTest.test3();
	}

	public void test1() {
		String s1 = "spring ";
		String s2 = s1 + "summer ";
		s1.concat("fall ");
		s2.concat(s1);
		s1 += "winter ";
		System.out.println(s1 + " " + s2);

	}

	public void test2() {
		String s1 = "boo:and:foo";
		System.out.println(Arrays.toString(s1.split("o", 5)));
		System.out.println(Arrays.toString(s1.split("o", -2)));
		System.out.println(Arrays.toString(s1.split("o", 0)));
		System.out.println(Arrays.toString(s1.split("o", 1)));
	}

	private void test3() {
		System.out.println("s3 = " + s3);

		String s4 = null;
		System.out.println("s4 = " + s4);

	}
	
	private void test4() {
		String $myString = "0";
		String €myString = "0";
		
	}
	
}
