package JavaPraticeQuestions;

public class Octal_To_Binary {
    public static void main(String[] args) {
        int octalnum=67;
        long binary=converttobinarynum(octalnum);
        System.out.println(binary);
    }
    public static long converttobinarynum(int octalnum){
        int decimal=0,i=0;
        long binarynum=0;
        while (octalnum!=0){
            decimal+=(octalnum%10)*Math.pow(8,i);
            i++;
            octalnum/=10;
        }
        i=1;
        while(decimal!=0){
            binarynum+=(decimal%2)*i;
            decimal/=2;
            i*=10;

        }
        return binarynum;

    }
}
