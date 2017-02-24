package tsc.draft.misc;

public class TryCatchTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

//        try {
//
//            try {
//
//                System.out.println("avant exception");
//
//                throw new Exception("toto");
//
//                // AHAHAHA ! Unreachable code ;)
//                // System.out.println("après exception");
//
//            } finally {
//                System.out.println("finally");
//            }
//
//        } catch (Exception e) {
//            System.out.println("catch de fin");
//        }
        
        try {
            try {
                System.out.println("try1");
                throw new Exception();
            } catch (Exception e) {
                System.out.println("catch1");
                throw e;
            }
        } catch (Exception e2) {
            System.out.println("catch2");
        }

    }

}
