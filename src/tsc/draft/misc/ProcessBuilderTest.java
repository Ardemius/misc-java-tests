package tsc.draft.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

import org.apache.log4j.Logger;

public class ProcessBuilderTest {

   private static final Logger logger = Logger.getLogger(ProcessBuilderTest.class);

   public static void main(String[] args) {
      System.out.println("from getHostnameThroughInetAddress: " + getHostnameThroughInetAddress());
      System.out.println("from getHostnameThroughProcessBuilder: " + getHostnameThroughProcessBuilder());
   }

   private static String getHostnameThroughInetAddress() {
      String hostName = null;
      try {
         final InetAddress addr = InetAddress.getLocalHost();
         hostName = new String(addr.getHostName());
      } catch (final Exception e) {

      }
      return hostName;
   }

   private static String getHostnameThroughProcessBuilder() {
      Process process = null;
      String result = null;
      String error = null;
      try {
         process = new ProcessBuilder("cmd", "/c", "hostname").start();
         //         process = new ProcessBuilder("cmd", "/c", "ftype", "JNLPFile").start();
         // Get input streams
         BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
         BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

         // Read command standard output
         StringBuilder resultBuilder = new StringBuilder();
         String tmp = null;
         while ((tmp = stdInput.readLine()) != null) {
            resultBuilder.append(tmp);
         }
         result = resultBuilder.toString();

         // Read command errors
         StringBuilder errorBuilder = new StringBuilder();
         tmp = null;
         while ((tmp = stdError.readLine()) != null) {
            errorBuilder.append(tmp);
         }
         error = errorBuilder.toString();

      } catch (IOException e) {
         logger.error("Error when executing the \"hostname\" command.", e);
      }

      return result != null ? result : error;
   }

}
