package tsc.draft.misc;

public abstract class ImplementationClass extends AbstractClassTest {

	@Override
	Integer speak() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void doAThing(int intTest) throws MyNewException {
		if (intTest > 5) {
			throw new MyNewException();
		}
	}

}
