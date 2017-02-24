package tsc.draft.misc;

public class OverloadingResolutionTest {

   public void doSomething(Object arg1, String arg2) {
      System.out.println("Object, String");
   }

   public void doSomething(String arg1, Object arg2) {
      System.out.println("String, Object");
   }

   public static void main(String[] args) {
      OverloadingResolutionTest test = new OverloadingResolutionTest();
      test.doSomething(null, "toto");
   }
}
