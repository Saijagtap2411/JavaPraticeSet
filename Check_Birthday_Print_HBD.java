package JavaPraticeQuestions;

import java.time.LocalDateTime;
import java.time.Month;

public class Check_Birthday_Print_HBD {
    public static void main(String[] args) {
        int birthdate=13;
        Month birthmonth=Month.AUGUST;

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println("Current date is "+currentDateTime);

        int date=currentDateTime.getDayOfMonth();
        Month month=currentDateTime.getMonth();

        if(date==birthdate && month==birthmonth){
            System.out.println("Wish u a very happy birthday!!!");
        }
        else{
            System.out.println("Today is not your birthday!!!");
        }
    }
}
