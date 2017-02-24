package tsc.draft.optimization;

public class ArrayTraversal {

   private final static int ROWS = 50;

   private final static int COLUMNS = 1000000;

   public static void main(String[] args) {
      ArrayTraversal t = new ArrayTraversal();
      t.rowFirstTraversal();
      t.columnFirstTraversal();
   }

   private void rowFirstTraversal() {

      long[][] tab = new long[ROWS][COLUMNS];
      long result = 0;

      System.out.println("tab 1st dimension length = " + tab.length);
      System.out.println("tab 2nd dimension length = " + tab[0].length);

      long start = System.nanoTime();

      for (int i = 0; i < ROWS; i++) {
         for (int j = 0; j < COLUMNS; j++) {
            result += tab[i][j];
         }
      }

      long end = System.nanoTime();
      long duration = (end - start) / 1000000;
      System.out.println("duration = " + duration);
   }

   private void columnFirstTraversal() {

      long[][] tab = new long[ROWS][COLUMNS];
      long result = 0;

      System.out.println("tab 1st dimension length = " + tab.length);
      System.out.println("tab 2nd dimension length = " + tab[0].length);

      long start = System.nanoTime();

      for (int j = 0; j < COLUMNS; j++) {
         for (int i = 0; i < ROWS; i++) {
            result += tab[i][j];
         }
      }

      long end = System.nanoTime();
      long duration = (end - start) / 1000000;
      System.out.println("duration = " + duration);
   }

}
