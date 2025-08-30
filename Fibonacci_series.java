package JavaPraticeQuestions;

public class Fibonacci_series {
    public static void main(String[] args) {
        int n=10,f1=0,f2=1;
        for(int i=1;i<=n;i++){
            System.out.println(f1+" ");
            int lastterm=f1+f2;
            f1=f2;
            f2=lastterm;
        }
    }
}
