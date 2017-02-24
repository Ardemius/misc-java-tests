package tsc.draft.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class DisplayJavaDeploymentProperties {

   public static void main(String[] args) {

      String appData = System.getenv("APPDATA");
      System.out.println("APPDATA = " + appData);

      String proxyTypeFromJava = System.getProperty("deployment.proxy.type");
      System.out.println("proxyTypeFromJava = " + proxyTypeFromJava);

      String userHome = System.getProperty("user.home");
      System.out.println("user.home = " + userHome);

      String otherProp = System.getProperty("deployment.modified.timestamp");
      System.out.println("deployment.modified.timestamp = " + otherProp);

      System.out.println(
         "-----------------------------------------------------------------------------------------------------------------");

      Properties properties = new Properties();
      try {
         properties.load(new FileInputStream("deployment.properties"));
         String proxyType = properties.getProperty("deployment.proxy.type");
         String securityLevel = properties.getProperty("deployment.security.level");
         System.out.println("after deployment.properties load, deployment.proxy.type = " + proxyType);
         System.out.println("after deployment.properties load, securityLevel = " + securityLevel);

         System.out.println(
            "-----------------------------------------------------------------------------------------------------------------");

         // File deploymentPropFile = new File("C:\\\\SOME_PATH\\\\AppData\\\\LocalLow\\\\Sun\\\\Java\\\\Deployment\\\\deployment.properties");
         File deploymentPropFile = new File("deployment.properties");

         DecimalFormat df = new DecimalFormat("#,###,###,##0.00");

         long startGuava = System.nanoTime();
         String guavaContent = Files.toString(deploymentPropFile, Charsets.UTF_8);
         long endGuava = System.nanoTime();
         System.out.println("guava process duration = " + df.format((endGuava - startGuava)));

         //System.out.println("Guava : whole deployment.properties as text = " + guavaContent);

         System.out.println(
            "-----------------------------------------------------------------------------------------------------------------");

         long startCio = System.nanoTime();
         String cioContent = FileUtils.readFileToString(deploymentPropFile, "UTF-8");
         long endCio = System.nanoTime();
         System.out.println("cio process duration = " + df.format((endCio - startCio)));

         /**
          * CONCLUSION :
          * guava process duration = 20.180.635,00
          * cio process duration = 6.213.141,00
          * CIO is almost 3 times faster
          */

         System.out.println("Apache commons IO : whole deployment.properties as text = " + cioContent);

      } catch (IOException e) {
         e.printStackTrace();
      }

   }
}
