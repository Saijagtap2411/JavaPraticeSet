package JavaPraticeQuestions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Convert_Stack_Trace_To_String {
    public static void main(String[] args) {
        try{
            int div=0/0;
        }
        catch(ArithmeticException e){
            StringWriter sw=new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
        System.out.println(sw.toString());}
    }
}
