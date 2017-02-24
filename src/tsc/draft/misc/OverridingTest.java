package tsc.draft.misc;

public class OverridingTest {

   Alpha getObject() {
      return new Alpha();
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      OverridingTest test = new SubOverridingTest();

      System.out.println("valeur de x acc�d� directement = " + test.getObject().x);
      System.out.println("valeur de x acc�d� via getter = " + test.getObject().getX());
      // Morale de l'histoire : l'overriding ne concerne QUE les m�thodes, PAS les variables
      // (ces derni�res sont r�solues � la compilation)

   }

}

class SubOverridingTest extends OverridingTest {

   @Override
   Beta getObject() {
      return new Beta();
   }
}

class Alpha {
   int x = 5;

   public int getX() {
      return x;
   }
}

class Beta extends Alpha {
   int x = 10;

   @Override
   public int getX() {
      return x;
   }
}
