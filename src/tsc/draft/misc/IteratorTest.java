package tsc.draft.misc;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public void makeAnIteration() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("toto");
        a.add("titi");
        a.add("tata");

        for (Iterator iter = a.iterator(); iter.hasNext();) {
            String myString = (String) iter.next();
            System.out.println(myString);
        }

        for (String myString : a) {
            System.out.println(myString);
        }
        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        IteratorTest i = new IteratorTest();
        i.makeAnIteration();

    }

}
