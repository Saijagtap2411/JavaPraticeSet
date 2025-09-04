package JavaPraticeQuestions;

import java.sql.SQLOutput;

public class Pass_Method_As_Argument {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public void square(int n){
        int result=n*n;
        System.out.println("result: "+result);
    }
    public static void main(String[]args){
        Pass_Method_As_Argument obj=new Pass_Method_As_Argument();
        obj.square(10);
        obj.square(obj.add(3,4));

    }
}
