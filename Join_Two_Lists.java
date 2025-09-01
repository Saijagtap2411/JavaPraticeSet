package JavaPraticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Join_Two_Lists {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        list1.add("P");
        list1.add("M");
        list2.add("M");
        list2.add("O");
        list2.add("D");
        list2.add("I");
        List<String> list3=new  ArrayList<String>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
