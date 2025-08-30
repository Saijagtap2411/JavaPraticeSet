package JavaPraticeQuestions;

public class Factorial_Of_Number_Using_Recursion {
    public static void main(String[] args) {
    int number=4;
    int fact=factorial(number);
    System.out.println(fact);
    }
    public static int factorial(int number){
        if(number!=0){
            return number*factorial(number-1);
        }
        else{
            return 1;
        }
    }
}
