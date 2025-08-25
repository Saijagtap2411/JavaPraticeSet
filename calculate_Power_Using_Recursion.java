package JavaPraticeQuestions;

public class calculate_Power_Using_Recursion {
    public static void main(String[] args) {
        int num=3,powerraised=4;
        int result=calculatepower(num,powerraised);
        System.out.println(result);
    }
    public static int calculatepower(int num,int powerraised){
        if(powerraised!=0){
            return(num*calculatepower(num,powerraised-1));
        }
        else{
            return 1;
        }
    }
}
