package JavaPraticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_To_List {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"C");
        m1.put(2,"O");
        m1.put(3,"D");
        m1.put(4,"E");
        List<Integer> list1=new ArrayList<>(m1.keySet());
        List<String> list2=new ArrayList<>(m1.values());
        System.out.println("Key List: " + list1);
        System.out.println("Value List: " + list2);
    }
}
