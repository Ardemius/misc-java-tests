package tsc.draft.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExternalCommandCallTest {

   public static void main(String[] args) {
      /**
       * display result of Windows command "ftype JNLPFile"
       */
      String javawsAssociatedWithJNLPFiles = getJavawsAssociatedWithJNLPFiles();
      System.out.println("javaws associated with JNLP files = " + javawsAssociatedWithJNLPFiles);

   }

   public static String getJavawsAssociatedWithJNLPFiles() {
      Process process = null;
      String result = null;
      String error = null;
      try {
         //       Process process = Runtime.getRuntime().exec("cmd /c ftype JNLPFile");
         process = new ProcessBuilder("cmd", "/c", "ftype", "JNLPFile").start();
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
         e.printStackTrace();
      }

      if (result != null) {
         result = result.substring("JNLPFile=".length());
      }

      return result != null ? result : error;
   }
}
