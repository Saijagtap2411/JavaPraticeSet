package JavaPraticeQuestions;

public class GCD {
    public static void main(String[]args){
        int n=81;
        int gcd=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            gcd=i;
            }
            System.out.println(gcd);
        }
    }
}
