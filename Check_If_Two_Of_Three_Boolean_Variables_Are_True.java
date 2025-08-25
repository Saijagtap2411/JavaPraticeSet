package JavaPraticeQuestions;

import java.util.Scanner;

public class Check_If_Two_Of_Three_Boolean_Variables_Are_True {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first boolean value: ");
        boolean first = input.nextBoolean();

        System.out.print("Enter second boolean value: ");
        boolean second = input.nextBoolean();

        System.out.print("Enter third boolean value: ");
        boolean third = input.nextBoolean();

        boolean result;

        if(first){
            result=second || third;
        }
        else{
            result=second&&third;
        }
        if(result){
            System.out.println("There are two Boolean varibales which are true");
        }
        else{
            System.out.println("There are no two Boolean varibales which are true");
        }
    }
}
