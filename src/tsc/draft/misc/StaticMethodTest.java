package tsc.draft.misc;

public class StaticMethodTest {

    public static void testMethod() {
        System.out.println("test method");
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class StaticMethodSubTest extends StaticMethodTest {
    public void testMethod() {
        System.out.println("non static test method");
    }
}
