package JavaPraticeQuestions;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your operator('+,-,*,/') which your want to use:-");
        char operator = input.next().charAt(0);
        System.out.println("Enter your first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter your second number:");
        int secondNumber = input.nextInt();
        switch(operator){
            case '+':
                int result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case '*':
                 result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            case '/':
                 result = firstNumber / secondNumber;
                System.out.println(result);
                break;
                default:
                    System.out.println("Invalid input OR Operator");
                    break;
        }
    }
}
