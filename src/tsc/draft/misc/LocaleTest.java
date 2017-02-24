package tsc.draft.misc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LocaleTest localeTest = new LocaleTest();
        localeTest.test();
    }

    private void test() {
        Calendar currentDate = Calendar.getInstance();
        DateFormat dfFR = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE);
        DateFormat dfUS = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        
        String currentDateFR = dfFR.format(currentDate.getTime());
        String currentDateUS = dfUS.format(currentDate.getTime());
        
        System.out.println("current date FR = " + currentDateFR);
        System.out.println("current date US = " + currentDateUS);
    }
    
}
