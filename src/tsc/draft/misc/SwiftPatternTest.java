package tsc.draft.misc;

import java.util.regex.Pattern;

public class SwiftPatternTest {

   protected static final Pattern PATTERN_descriptionOfSecurity = Pattern
      .compile("(?:[\\p{Alpha}\\d/ \\-?:().,'+]{1,35}){1}(?:[\\r][\\n][\\p{Alpha}\\d/ \\-?:().,'+]{1,35}){0,3}"); // [4*35x] SWIFT format

   public static void main(String[] args) {

      CharSequence descriptionOfSecurity = "RENAULT 3,125%0321";
      // check the format of tag field descriptionOfSecurity against regular expression
      if (!PATTERN_descriptionOfSecurity.matcher(descriptionOfSecurity).matches()) {
         System.out.println("BAD ! 35B " + descriptionOfSecurity + " Description of Security" + "[4*35x]");
      } else {
         System.out.println("good");
      }

   }

}
