package tsc.draft.misc;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyRunnable());
        Thread threadB = new Thread(new MyRunnable());
        threadA.start();
        threadB.start();
    }

}

class MyRunnable implements Runnable {

    static List<Integer> sharedList = new ArrayList<Integer>();

    public void run() {
        sharedList.add(1);
        sharedList.add(2);
        sharedList.add(3);
        
        System.out.println(sharedList.toString());
    }

}
