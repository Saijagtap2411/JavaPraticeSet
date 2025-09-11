package JavaPraticeQuestions;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Principal amount:");
        double p=sc.nextDouble();
        System.out.println("Enter Your Rate rate:");
        double r=sc.nextDouble();
        System.out.println("Enter Your Time amount:");
        double t=sc.nextDouble();

        double interest=p*r*t/100;
        System.out.println("Your Interest is "+interest);
    }
}
