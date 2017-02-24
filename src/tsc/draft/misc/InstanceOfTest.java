package tsc.draft.misc;

public class InstanceOfTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] key = new int[5];
		int key2[] = new int[2];
		int key3 [] = new int[6];
		
		Tiger[] tigerArray = new Tiger[5];
		
		Predator pred = new Tiger();
		Cat miaou = new Cat();
		if (pred instanceof Tiger) {
			System.out.println("pred is a Tiger");
		}
		
		if (miaou instanceof Cat) {
			System.out.println("miaou is a cat");
		}
		
//		if (tigerArray instanceof Predator) {
//			Predator thisTiger = (Predator) tigerArray;
//			
//		}
		
//		if (miaou instanceof Predator) {
//			Predator miaourrrr = (Predator) miaou;
//			
//		}

	}

}

class Cat {
	
}

class Predator {
	private int nbGriffes = 0;
}

class Tiger extends Predator {
	public void setNbGriffes(int nbGriffes) {
		this.nbGriffes = nbGriffes;
	}
}
