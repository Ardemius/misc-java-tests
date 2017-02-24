package tsc.draft.misc.otherpackage;

public class ProtectedTestB extends ProtectedTestA {

    @Override
    public void work() {
        System.out.println("done in ProtectedTest B");
    }
    
    public void workHow() {
        workMore();
    }

}
