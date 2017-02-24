package tsc.draft.collection;

import java.util.LinkedHashSet;
import java.util.Set;

class SetTest {

  public static void main(String[] args) {
    boolean[] ba = new boolean[5];

    Set s = new LinkedHashSet();

    ba[0] = s.add("a");
    ba[1] = s.add(new Integer(42));
    ba[2] = s.add("b");
    ba[3] = s.add("a");
    ba[4] = s.add(new Object());
    for (int x = 0; x < ba.length; x++)
      System.out.print(ba[x] + " ");
    
    System.out.println("\n");
    
    for (Object o : s)
      System.out.print(o + " ");
    
    System.out.println("\n");
    
    for (Object o : s)
      System.out.print(o + " ");
  }
}