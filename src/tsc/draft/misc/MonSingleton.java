package tsc.draft.misc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonSingleton {

	private static int threadNb = 0;
	private static MonSingleton instance = null;

	private MonSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static MonSingleton getInstance() {
		threadNb++;
		int numeroCourant = threadNb;
		DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println("Thread " + numeroCourant + " has started at "
				+ formatDate.format(new Date()));

		long deb = System.nanoTime();

		if (instance == null) {
			// synchronized (instance) { << génère une NullPointerException,
			// normal
			synchronized (MonSingleton.class) {
				if (instance == null) {
					instance = new MonSingleton();
				}
				System.out.println("durée du bloc " + numeroCourant + " = "
						+ (System.nanoTime() - deb));
			}
		}
		
		return instance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// MonSingleton monSingleton = MonSingleton.getInstance();
		// System.out.println("monSingleton = " + monSingleton.toString());
		// monSingleton = MonSingleton.getInstance();
		// System.out.println("monSingleton = " + monSingleton.toString());
		// monSingleton = MonSingleton.getInstance();
		// System.out.println("monSingleton = " + monSingleton.toString());
		// monSingleton = MonSingleton.getInstance();
		// System.out.println("monSingleton = " + monSingleton.toString());

		Thread t = null;
		for (int i = 0; i < 50; i++) {
			t = new Thread() {
				@Override
				public void run() {
					MonSingleton monSingleton = MonSingleton.getInstance();
				}
			};
			t.start();
		}

	}
}
