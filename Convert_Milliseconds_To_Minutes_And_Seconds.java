package JavaPraticeQuestions;

import java.util.concurrent.TimeUnit;

public class Convert_Milliseconds_To_Minutes_And_Seconds {
    public static void main(String[] args) {
        long milliseconds = 1000000;
        long seconds= TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        long minutes= TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        System.out.println(minutes);
        System.out.println(seconds);
    }
}
