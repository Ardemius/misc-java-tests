package tsc.draft.misc;

public class ThreadSynchronizeTest extends Thread {

	private StringBuffer data;

	public ThreadSynchronizeTest(StringBuffer sb) {
		super();

		this.data = sb;
	}

	@Override
	public void run() {
		synchronized (data) {
			for (int i = 0; i < 100; i++) {
				System.out.print(data);
			}
			// increment the letter
			char c = data.charAt(0);
			data.setCharAt(0, ++c);
			System.out.println(" -- fin -- ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");

		Thread t1 = new ThreadSynchronizeTest(sb);
		Thread t2 = new ThreadSynchronizeTest(sb);
		Thread t3 = new ThreadSynchronizeTest(sb);

		t1.start();
		t2.start();
		t3.start();
	}

}
