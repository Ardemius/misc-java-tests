package tsc.draft.misc;

import java.io.File;

public class FileTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String directoryPath = "Z:\\IGatesTeam\\Thomas\\Tests & Issues\\scheduled pb\\request_" + 111;
        File dir = new File(directoryPath);
        if (dir.mkdir()) {
            System.out.println("dir created");
        } else {
            System.out.println("dir NOT created");
        }
    }

}
