package JavaPraticeQuestions;

import java.util.Calendar;

public class Add_Two_Dates {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Calendar ctotal=(Calendar)c1.clone();
        ctotal.add(Calendar.YEAR,c2.get(Calendar.YEAR));
        ctotal.add(Calendar.MONTH,c2.get(Calendar.MONTH));
        ctotal.add(Calendar.DATE,c2.get(Calendar.DATE));
        ctotal.add(Calendar.HOUR,c2.get(Calendar.HOUR_OF_DAY));
        ctotal.add(Calendar.MINUTE,c2.get(Calendar.MINUTE));
        ctotal.add(Calendar.SECOND,c2.get(Calendar.SECOND));
        ctotal.add(Calendar.MILLISECOND,c2.get(Calendar.MILLISECOND));
        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), ctotal.getTime());

    }
}
