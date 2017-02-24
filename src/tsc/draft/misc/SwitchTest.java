package tsc.draft.misc;


/**
 * @author Administrateur
 *
 * Le but de cette classe est de tester les "constantes" permises dans les cases d'un
 * switch
 */
public class SwitchTest {
	
	public static final Integer INTEGER_1 = new Integer(1);
	public static final Integer INTEGER_2 = new Integer(2);
	public static final Integer INTEGER_3 = new Integer(3);
	public static final Integer INTEGER_4 = new Integer(4);
	public static final Integer INTEGER_5 = new Integer(5);
	public static final Integer INTEGER_6 = new Integer(6);
	
	// the labels in a switch-case statement have to be compile-time constant. 
	// Anything that involves calling a method is not.
	public static final int INT_METHOD = "a_string".hashCode();
	
	public static final int INT_CONSTANT = 7;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void switchTest() {
		
		Integer monInteger = new Integer(5);
		
		switch (monInteger) {
		case 5:
			System.out.println("monInteger = " + monInteger);
			break;
		case INTEGER_1:
			System.out.println("monInteger = " + monInteger);
			break;
		case INT_METHOD:
			System.out.println("monInteger = " + monInteger);
			break;
		case INT_CONSTANT:
			System.out.println("monInteger = " + monInteger);
			break;

		default:
			System.out.println("C'est pas bon !");
			break;
		}
	}

}
