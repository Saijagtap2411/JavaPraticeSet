package JavaPraticeQuestions;

import java.util.ArrayList;

public class Pass_Lambda_Expression_As_A_Method_Argument {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("php");
        list.add("python");
        System.out.println("Old Array list is: "+list);
         list.replaceAll(e->e.toUpperCase());
         System.out.println("New Array list is: "+list);
    }
}
