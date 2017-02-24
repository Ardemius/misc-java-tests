package tsc.draft.misc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

public class BigDecimalTest {

   public static void main(String[] args) {
      BigDecimalTest bigDecimalTest = new BigDecimalTest();
      //      String v1 = "22.36649";
      //      bigDecimalTest.splitTest(v1);
      //      bigDecimalTest.splitStringTest(v1);
      //
      //      String v2 = "22.36641";
      //      bigDecimalTest.splitTest(v2);
      //      bigDecimalTest.splitStringTest(v2);

      BigDecimal grossAmount = new BigDecimal("370835.5");
      BigDecimal quantity = new BigDecimal("3567");
      bigDecimalTest.divideTest(grossAmount, quantity);

      grossAmount = new BigDecimal("10");
      quantity = new BigDecimal("3");
      bigDecimalTest.divideTest(grossAmount, quantity);
   }

   public void splitTest(String initialStringValue) {
      System.out.println("----------------------------------------------------------------------------");
      BigDecimal initialValue = new BigDecimal(initialStringValue);
      int precision = initialValue.precision();

      System.out.println("---- SPLIT TEST: remainder and divideToIntegralValue ----");
      BigDecimal decimalPart = initialValue.remainder(BigDecimal.ONE);
      BigDecimal integralPart = initialValue.divideToIntegralValue(BigDecimal.ONE);
      int integralPartIntValue = integralPart.intValue();

      System.out.println("initialValue = " + initialValue);
      System.out.println("precision = " + precision);
      System.out.println("integerPart = " + integralPart);
      System.out.println("integerPartIntValue = " + integralPartIntValue);
      System.out.println("decimalPart = " + decimalPart);

      System.out.println("After conversion:");
      // convertion on 4 digits with rounding mode HALF_UP
      BigDecimal convertedBd = decimalPart.setScale(4, RoundingMode.HALF_UP);
      System.out.println("convertedBd = " + convertedBd.toPlainString());

      System.out.println("---- SPLIT TEST: divideAndRemainder ----");
      BigDecimal[] decimalAndIntegralPart = initialValue.divideAndRemainder(BigDecimal.ONE);
      integralPart = decimalAndIntegralPart[0];
      decimalPart = decimalAndIntegralPart[1];
      integralPartIntValue = integralPart.intValue();

      System.out.println("integerPart = " + integralPart);
      System.out.println("integerPartIntValue = " + integralPartIntValue);
      System.out.println("decimalPart = " + decimalPart);

      System.out.println("After conversion:");
      // convertion on 4 digits with rounding mode HALF_UP
      convertedBd = decimalPart.setScale(4, RoundingMode.HALF_UP);
      String convertedBdString = convertedBd.toPlainString();
      System.out.println("convertedBd = " + convertedBdString);
      System.out.println("without leading '0.':");
      convertedBdString = convertedBdString.substring(2);
      System.out.println("convertedBd = " + convertedBdString);
      System.out.println("----------------------------------------------------------------------------");

   }

   public void splitStringTest(String initialStringValue) {
      System.out.println("---- SPLIT STRING TEST ----");
      System.out.println("initialStringValue = " + initialStringValue);
      BigDecimal initialValue = new BigDecimal(initialStringValue);
      String plainInitialValue = initialValue.toPlainString();
      Iterable<String> split = Splitter.on(".").split(plainInitialValue);
      for (String elt : split) {
         System.out.println("elt = " + elt);
      }
      String integerPart = Iterables.getFirst(split, "0");
      String fractionalPart = Iterables.getLast(split);
      System.out.println("integerPart = " + integerPart);
      System.out.println("fractionalPart = " + fractionalPart);

      System.out.println("After conversion:");
      // convertion on 4 digits with rounding mode HALF_UP
      BigDecimal convertedBd = new BigDecimal(fractionalPart, new MathContext(4, RoundingMode.HALF_UP));
      System.out.println("convertedBd = " + convertedBd.toPlainString());

      // MARCHE PAS !
      // il faut passer par la méthode splitTest.
      // En effet, ici on la fractionalPart sous la forme d'un entier, aucune conversion n'est donc possible...
   }

   public void divideTest(BigDecimal grossAmount, BigDecimal quantity) {

      System.out.println("grossAmount = " + grossAmount);
      System.out.println("quantity = " + quantity);

      BigDecimal quotient = grossAmount.divide(quantity, MathContext.DECIMAL32);
      System.out.println("divide with MathContext.DECIMAL32 = " + quotient);
      quotient = grossAmount.divide(quantity, MathContext.DECIMAL64);
      System.out.println("divide with MathContext.DECIMAL64 = " + quotient);
      quotient = grossAmount.divide(quantity, MathContext.DECIMAL128);
      System.out.println("divide with MathContext.DECIMAL128 = " + quotient);
      quotient = grossAmount.divide(quantity, 9, RoundingMode.HALF_UP);
      System.out.println("divide with scale 9 and rounding mode HALF_UP = " + quotient);

   }

}
