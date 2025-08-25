package JavaPraticeQuestions;

public class Convert_Octal_To_Decimal {
    public static void main(String[] args) {
        int octalnum=116;
        int decimal=converttodecimal(octalnum);
        System.out.println(decimal);

    }
    public static int converttodecimal(int octalnum)
    {
        int decimal=0,i=0;
        while(octalnum!=0){
            decimal+=(octalnum%10)*Math.pow(8,i);
            i++;
            octalnum/=10;
        }
        return decimal;
    }
}
