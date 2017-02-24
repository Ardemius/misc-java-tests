package tsc.draft.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pattern p = Pattern.compile("My");
		Matcher m = p.matcher("My dad and My mom");

		StringBuffer sb = new StringBuffer();
		boolean b = m.find();
		while (b) {
			m.appendReplacement(sb, "Our");
			b = m.find();
		}
		m.appendTail(sb);

		System.out.println(sb);

	}

}
