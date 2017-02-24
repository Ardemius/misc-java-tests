package tsc.draft.misc;

class Titanic {
	public static void main(String[] args) {
		Boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = true;
		if ((b1 & b2) | (b2 & b3) & b3)
			System.out.print("alpha ");
		if ((b1 = false) | (b1 & b3) | (b1 | b2))
			System.out.print("beta ");
		
		System.out.println(b1.booleanValue());
		System.out.println(b1.booleanValue() & b3);
		System.out.println(b1 && b3);
		System.out.println(b3 & b4);
	}
}
