package JavaPraticeQuestions;

public class Palindrome_Number {
    public static void main(String[] args) {
        int n=3553,rev=0,rem;
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        if(rev==temp){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
