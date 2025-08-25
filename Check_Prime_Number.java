package JavaPraticeQuestions;

public class Check_Prime_Number {
    public static void main(String[] args) {
        int num=113;
        boolean flag=false;
        if(num==0 || num==1){
            flag=true;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("is prime number");
        }
        else{
            System.out.println("is not prime number");
        }
}}
