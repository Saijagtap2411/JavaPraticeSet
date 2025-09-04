package JavaPraticeQuestions;

public class Power_Of_Number {
    public static void main(String[]args){
        int base=2,exponent=4;
        long result=1;
        while(exponent!=0){
        result*=base;
        exponent--;
        }
        System.out.println(result);
    }
}
