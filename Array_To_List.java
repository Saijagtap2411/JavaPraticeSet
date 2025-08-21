package JavaPraticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_To_List {
    public static void main(String args[]) {
        String[] cars={"Mercedes","BMW","Mustang"};
        System.out.println("Orginal array was : "+Arrays.toString(cars));
        ArrayList list=new ArrayList<>(Arrays.asList(cars));
        System.out.println(" ArrayList is : "+list);
    }
}
