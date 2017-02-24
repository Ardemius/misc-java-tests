package tsc.draft.misc;

public class ArithmeticClass {

   /**
    * @param args
    */
   public static void main(String[] args) {
      ArithmeticClass arithmetic = new ArithmeticClass();
      arithmetic.boxingTest();
      arithmetic.conversionTest();
      arithmetic.otherConversionTest();
      System.out.println(arithmetic.floatTest());
   }

   private void boxingTest() {
      Integer i1 = 100;
      Integer i2 = 100;

      if (i1 == i2) {
         System.out.println("i1 et i2 r�f�rencent le m�me wrapper !");
      } else {
         System.out.println("i1 et i2 NE r�f�rencent PAS le m�me wrapper !");
      }

      Integer i3 = 150;
      Integer i4 = 150;

      if (i3 == i4) {
         System.out.println("i3 et i4 r�f�rencent le m�me wrapper !");
      } else {
         System.out.println("i3 et i4 NE r�f�rencent PAS le m�me wrapper !");
      }
   }

   private void conversionTest() {
      double d = 123.456;
      System.out.printf("%5.0f", d);
   }

   private void otherConversionTest() {
      double r = 1 / 3;
      System.out.println("r = " + r);
   }

   private float floatTest() {
      float f = Float.NaN;
      f = 1.2f;
      f = 2;
      //f = 2.0;
      f = Float.NaN;

      return f;
   }

}
