package tsc.draft.misc;

public class TestThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestThread().start();
		new TestThread().start();

	}

	@Override
	public void run() {
		Safe s1 = new Safe("abc");
		Safe s2 = new Safe("xyz");
	}

}

class Safe {
	private String str;

	public Safe(String s) {
		synchronized (this) {
			str = s;
			str = str.toUpperCase();
			System.out.println(str + " ");
		}
	}
}
