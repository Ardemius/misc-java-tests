package tsc.draft.misc;

import java.util.ArrayList;
import java.util.List;

class Car {
}

class Ferrari extends Car {
}

class Peugeot extends Car {
}

public class GenericTestWildcard {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Ferrari());
		cars.add(new Peugeot());
		
		List<Car> cars2 = new ArrayList<Ferrari>();
		cars.add(new Ferrari());
		cars.add(new Peugeot());
		
		List<? extends Car> cars3 = new ArrayList<Ferrari>();
		cars3.add(new Ferrari());
		
		List<? extends Car> cars4 = new ArrayList<Car>();
	}

}
