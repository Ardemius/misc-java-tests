package tsc.draft.misc;

class Bird {
	{
		System.out.println("b1");
	}
	
	static {
		System.out.println("b2");
	}
	
	public Bird () {
		System.out.println("b3");
	}
}

class Raptor extends Bird {
	static {
		System.out.println("r1");
	}
	
	public Raptor () {
		System.out.println("r2");
	}
	
	{
		System.out.println("r3");
	}
	
	static {
		System.out.println("r4");
	}
}

class SuperRaptor extends Raptor {
	static {
		System.out.println("s1");
	}
	
	
}

public class Hawk extends SuperRaptor {
	
	static {
		System.out.println("h1");
	}
	
	static {
		System.out.println("h2");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("pre");
		new Hawk();
		System.out.println("hawk ");
	}

}
