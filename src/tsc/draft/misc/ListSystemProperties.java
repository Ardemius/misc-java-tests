package tsc.draft.misc;

import java.util.Properties;

public class ListSystemProperties {

   public static void main(String[] args) {
      Properties props = System.getProperties();
      props.list(System.out);

      // get user.home property
      String userHomeProperty = props.getProperty("user.home");
      System.out.println("user.home is: " + userHomeProperty);
   }

}
