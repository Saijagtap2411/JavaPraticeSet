package JavaPraticeQuestions;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Principal amount:");
        double p=sc.nextDouble();
        System.out.println("Enter Your Rate rate:");
        double r=sc.nextDouble();
        System.out.println("Enter Your Time amount:");
        double t=sc.nextDouble();
        System.out.print("Enter number of times interest is compounded: ");
        int number = sc.nextInt();

        double interest=p*(Math.pow((1+r/100),(t*number)))-p;
        System.out.println("Your Interest is "+interest);
    }
}
