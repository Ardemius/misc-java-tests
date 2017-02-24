package tsc.draft.misc;

import java.util.HashSet;
import java.util.Set;

public class GenericTest {

	public Set<Dog> getDogList() {
		Set<Dog> dogs = new HashSet<Dog>();
		dogs.add(new Dog(50, "rex"));
		return dogs;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericTest t = new GenericTest();
		Dog dog = t.getDogList().get(0);

	}

}
