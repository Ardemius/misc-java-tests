package tsc.draft.misc;

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	Animals(String s) {
		sound = s;
	}
}

public class ComplexEnumTest2 {
	
	static Animals a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Animals.DOG.sound + " " + a.FISH.sound);
		
		char c = (char) -65;
		System.out.println("que vaut ce char : " + c);
		
	}

}
