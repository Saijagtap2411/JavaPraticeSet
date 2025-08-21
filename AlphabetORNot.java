package JavaPraticeQuestions;

import java.util.Scanner;

public class AlphabetORNot {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character");
        String input=sc.nextLine();
        char ch=input.charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("entered character is an alphabet!!!");
        }
        else {
            System.out.println("entered character is not an alphabet!!!");
        }


    }
}
