package JavaPraticeQuestions;

import java.util.ArrayList;

public class List_To_Array {
    public static void main(String[]args){
        ArrayList cars=new ArrayList();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Mustang");
        cars.add("Porsche");
        System.out.println("Original ArrayList was : "+cars);
        String[]arr=new String[cars.size()];
        cars.toArray(arr);
        for(String vechile:arr){
            System.out.printf(vechile+" ");
        }
    }
}
