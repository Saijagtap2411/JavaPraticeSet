package JavaPraticeQuestions;

public class Calculate_Method_Execution_Time {
    public void display(){
        System.out.println("Calculating Method execution time:");
    }
    public static void main(String[] args) {
        Calculate_Method_Execution_Time c=new Calculate_Method_Execution_Time();
        long start=System.nanoTime();
        c.display();
        long end=System.nanoTime();
        long duration=end-start;
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
