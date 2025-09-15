package JavaPraticeQuestions;

import java.util.Scanner;

public class VowelORConsonant {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an charcter: ");
        String input=sc.nextLine();
        char ch=input.charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" is vowel");
        }
        else{
            System.out.println(ch+" is consonant");
        }
    }
}
