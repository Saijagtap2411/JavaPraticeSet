package JavaPraticeQuestions;

public class Factors_Of_Positive_Integer {
    public static void main(String[] args) {
        int n=60;
        System.out.println("factor of given number is:- ");
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}
