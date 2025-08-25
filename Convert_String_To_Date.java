package JavaPraticeQuestions;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;



import java.time.LocalDate;

public class Convert_String_To_Date {
    public static void main(String[] args) {
        String str="2025-07-27";
        LocalDate date=LocalDate.parse(str,DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
