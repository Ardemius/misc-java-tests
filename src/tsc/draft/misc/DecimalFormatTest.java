package tsc.draft.misc;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DecimalFormatTest {

   public static void main(String[] args) {

      DecimalFormatTest decimalFormatTest = new DecimalFormatTest();
      decimalFormatTest.test("#.##");
      decimalFormatTest.test("#.00");
      decimalFormatTest.test("0.00");

   }

   public void test(String formatPattern) {
      System.out.println("-------------------- For pattern " + formatPattern + "--------------------------");
      BigDecimal number = new BigDecimal("132.456");
      BigDecimal number2 = new BigDecimal("0.456");
      BigDecimal number3 = new BigDecimal("27");
      BigDecimal number4 = new BigDecimal("145.1");

      DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols();
      unusualSymbols.setDecimalSeparator('.');
      DecimalFormat df = new DecimalFormat(formatPattern, unusualSymbols);
      String formattedNumber = df.format(number);
      System.out.println("132.456 is " + number);
      System.out.println("after formatting = " + formattedNumber);
      formattedNumber = df.format(number2);
      System.out.println("0.456 is " + number2);
      System.out.println("after formatting = " + formattedNumber);
      formattedNumber = df.format(number3);
      System.out.println("27 is " + number3);
      System.out.println("after formatting = " + formattedNumber);
      formattedNumber = df.format(number4);
      System.out.println("145.1 is " + number4);
      System.out.println("after formatting = " + formattedNumber);
      System.out.println("---------------------------------------------------------------");
   }

}
