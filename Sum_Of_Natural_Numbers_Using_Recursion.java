package JavaPraticeQuestions;

import java.util.Scanner;

public class Sum_Of_Natural_Numbers_Using_Recursion {
    public static void main(String args[]) {
    int number=20;
    int sum=addnumber(number);
    System.out.println(sum);
    }
    public static int addnumber(int num){
        if(num!=0){
            return num+addnumber(num-1);
        }
        else{
            return 0;
        }
    }
}
