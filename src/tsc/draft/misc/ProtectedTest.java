package tsc.draft.misc;

import tsc.draft.misc.otherpackage.ProtectedTestA;
import tsc.draft.misc.otherpackage.ProtectedTestB;

public class ProtectedTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ProtectedTestA a = new ProtectedTestA();
//        a.work();

        ProtectedTestB b = new ProtectedTestB();
        b.work();
        b.workHow();
//        b.workMore();
    }

}
