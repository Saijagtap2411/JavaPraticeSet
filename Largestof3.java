package JavaPraticeQuestions;

import java.util.Scanner;

public class Largestof3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int firstnumb=sc.nextInt();
        System.out.println("enter second number");
        int secondnumb=sc.nextInt();
        System.out.println("enter third number");
        int thirdnumb=sc.nextInt();
        if(firstnumb>secondnumb && firstnumb>thirdnumb){
            System.out.println("the largest number is "+firstnumb);
        }
        else if(secondnumb>firstnumb && secondnumb>thirdnumb){
            System.out.println("the largest number is "+secondnumb);
        }
        else{
            System.out.println("the largest number is "+thirdnumb);
        }
    }
}
