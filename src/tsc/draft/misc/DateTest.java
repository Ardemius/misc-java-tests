package tsc.draft.misc;

import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateTest myDate = new DateTest();
		myDate.dateTest();
	}

	public void dateTest() {
		Date d1 = new Date(1000000000000L); // a trillion!
		System.out.println("1st date " + d1.toString());
		d1.setTime(d1.getTime() + 3600000); // 3600000 millis / hour
		System.out.println("new time " + d1.toString());
	}

}
