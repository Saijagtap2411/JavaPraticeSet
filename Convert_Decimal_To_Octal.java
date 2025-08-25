package JavaPraticeQuestions;

public class Convert_Decimal_To_Octal {
    public static void main(String[] args) {
        int decimal=78;
        int octal=converttooctal(decimal);
        System.out.println(octal);
    }
    public static int converttooctal(int decimal){
        int octalnum=0,i=1;
        while(decimal!=0){
            octalnum+=(decimal%8)*i;
            decimal/=8;
            i*=10;
        }
        return octalnum;
    }
}
