package tsc.draft.misc;

import certification.pkg.Kit;

public class UseKit {

  public static void main(String[] args) {
    String s = new Kit().glueIt(args[1], args[2]);
    System.out.println(s);
  }
}