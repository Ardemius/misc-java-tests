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

      System.out.println("valeur de x accédé directement = " + test.getObject().x);
      System.out.println("valeur de x accédé via getter = " + test.getObject().getX());
      // Morale de l'histoire : l'overriding ne concerne QUE les méthodes, PAS les variables
      // (ces dernières sont résolues à la compilation)

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
