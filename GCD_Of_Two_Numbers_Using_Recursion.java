package JavaPraticeQuestions;

public class GCD_Of_Two_Numbers_Using_Recursion {
    public static int hcf(int a,int b){
        if(b!=0){
            return hcf(b,a%b);

        }
        else{
            return a;
        }
    }
    public static void main(String[] args) {
        int a=366,b=60;
        int result=hcf(a,b);
        System.out.println(result);
    }
}
