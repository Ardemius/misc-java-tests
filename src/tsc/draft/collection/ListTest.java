package tsc.draft.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

  public ListTest() {
  }

  void testForEach() {
    List<String> l = new ArrayList<String>();
    l.add("toto");
    l.add("tata");
    l.add("titi");

    for (String elt : l) {
      System.out.println(elt);
    }
  }

  void testToArray() {
    List<Integer> iL = new ArrayList<Integer>();
    for (int x = 0; x < 3; x++) {
      iL.add(x);
    }
    Object[] oa = iL.toArray(); // create an Object array
    oa[1] = 999;
    
    for (int i = 0; i < oa.length; i++) {
      System.out.println("list " + i + ": " + iL.get(i));
      System.out.println("array " + i + ": " + oa[i]);
      
    }
    
//    Integer[] ia2 = new Integer[3];
//    ia2 = iL.toArray(ia2); // create an Integer array
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    ListTest lt = new ListTest();
    lt.testForEach();
    lt.testToArray();
  }

}
