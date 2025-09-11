package JavaPraticeQuestions;

import java.util.Scanner;

public class SwapNumbs {
    public static void main(String[] args) {
        int temp;
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter first number:");

        int firstnumb=reader.nextInt();
        System.out.println("Enter second number:");

        int secondnumb=reader.nextInt();
        temp=firstnumb;
        firstnumb=secondnumb;
        secondnumb=temp;
        System.out.println("First number is :"+firstnumb);
        System.out.println("Second number is :"+secondnumb);

    }
}
