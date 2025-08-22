package JavaPraticeQuestions;

public class Binary_To_Octal {
    public static void main(String[] args) {
        long binary=101001;
        int octal=converttooctal(binary);
        System.out.println(octal);

    }
    public static int converttooctal(long binary){
        int octalnum=0,decimalNumber = 0,i=0;
        while(binary!=0){
            decimalNumber+=(binary%10)*Math.pow(2,i);
            i++;
            binary/=10;
        }
        i=1;
        while(decimalNumber!=0){
            octalnum+=(decimalNumber%8)*i;
            decimalNumber/=8;
            i*=10;
        }
        return octalnum;
    }
}
