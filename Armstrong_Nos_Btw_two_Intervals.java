package JavaPraticeQuestions;

import java.util.Scanner;

public class Armstrong_Nos_Btw_two_Intervals {
    public static boolean isArmStrong(int number){
        int orginal=number;
        int sum=0;
        int digits=String.valueOf(number).length();
        while(number!=0){
            int digit=number%10;
            sum+=Math.pow(digit,digits);
            number=number/10;
        }
        return sum==orginal;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the lower number");
        int low=scanner.nextInt();
        System.out.println("Enter the upper number");
        int high=scanner.nextInt();
        System.out.printf("Armstrong numbers between %d and %d: ", low, high);
        for(int i=low;i<=high;i++){
            if(isArmStrong(i)){
                System.out.print(i+" ");
            }
        }
    }
}
