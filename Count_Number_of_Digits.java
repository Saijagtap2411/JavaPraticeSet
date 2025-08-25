package JavaPraticeQuestions;

public class Count_Number_of_Digits {
    public static void main(String[] args) {
        int count=0;
        int n=1020304056;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
