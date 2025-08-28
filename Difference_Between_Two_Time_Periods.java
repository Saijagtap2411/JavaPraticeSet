package JavaPraticeQuestions;

public class Difference_Between_Two_Time_Periods {
    int seconds;
    int minutes;
    int hours;
    public Difference_Between_Two_Time_Periods(int seconds, int minutes, int hours) {
        this.seconds=seconds;
        this.minutes=minutes;
        this.hours=hours;
    }
    public static void main(String[] args) {
        Difference_Between_Two_Time_Periods start=new Difference_Between_Two_Time_Periods(8, 12, 15);
        Difference_Between_Two_Time_Periods end=new Difference_Between_Two_Time_Periods(12, 34, 55);
        Difference_Between_Two_Time_Periods diff;
        diff=difference(start,end);
        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", end.hours, end.minutes, end.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }
    public static Difference_Between_Two_Time_Periods difference(Difference_Between_Two_Time_Periods start, Difference_Between_Two_Time_Periods end) {
        Difference_Between_Two_Time_Periods diff=new Difference_Between_Two_Time_Periods(0,0,0);
        if(start.seconds>end.seconds){
            end.minutes--;
            end.seconds+=60;
        }
        diff.seconds = end.seconds - start.seconds;

        if(start.minutes>end.minutes){
            end.hours--;
            end.minutes+=60;
        }
        diff.minutes = end.minutes - start.minutes;
        diff.hours = end.hours - start.hours;
        return diff;

    }
}
