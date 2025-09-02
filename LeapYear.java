package JavaPraticeQuestions;

public class LeapYear {
    public static void main(String[] args) {
        int year=2004;
        boolean leap=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;
                }
                else{
                    leap=false;
                }
            }
            leap=true;
        }
        else{
            leap=false;
        }
        if(leap){
            System.out.println("its an leap year!!!");
        }
        else{
            System.out.println("its not an leap year!!!");
        }
    }
}
