package tsc.draft.misc;

public class VarArgsTest3 {
   public void varArgsMethod(Object... arr) {
      System.out.println(arr.getClass().getName());
      for (Object o : arr) {
         System.out.println(o);
      }
   }

   public static void main(String[] args) {
      VarArgsTest3 tva = new VarArgsTest3();
      tva.varArgsMethod(args);

      //      Object[] tSObjectArray = new Object[2];
      //      String[] tStringArray = (String[]) tSObjectArray;
      //      System.out.println(tStringArray);

      Object[] Object_Array = new String[] { "toto", "titi" };
      System.out.println("Object_Array - " + Object_Array.getClass());
      System.out.println("Object_Array - " + Object_Array.getClass().getSuperclass());
      System.out.println("Object_Array - " + Object_Array);

      int[] ia = new int[3];
      System.out.println("int[] - " + ia.getClass());
      System.out.println("int[] - " + ia.getClass().getSuperclass());

      String[] sa = new String[2];
      System.out.println("String[] - " + sa.getClass());
      System.out.println("String[] - " + sa.getClass().getSuperclass());

      Object[] oa = new Object[2];
      System.out.println("Object[] - " + oa.getClass());
      System.out.println("Object[] - " + oa.getClass().getSuperclass());

      // Array covariance is allowed :
      // An array of a derived class can be cast to an ancestor class array. So an array of Strings can be cast to an array of Objects.
      String[] String_Array = new String[] { "toto", "titi" };
      Object[] newObjectArray = String_Array;
      System.out.println("newObjectArray: " + newObjectArray);

   }
}