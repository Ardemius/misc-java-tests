package tsc.draft.misc;

public class ConstructorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CA ca = new CB();
    }

}

class CA {

    // Eh oui, ceci n'est PAS un constructeur ;) (un constructeur n'ayant pas de retour)
    public int CA() {
        System.out.println("toto");
        return 0;
    }

}

class CB extends CA {

    public CB() {
        super();
        System.out.println("B");
    }

}
