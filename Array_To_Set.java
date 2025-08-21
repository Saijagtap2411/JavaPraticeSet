package JavaPraticeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_To_Set {
    public static void main(String[] args) {
        String[]arr={"a", "b", "c"};
        Set<String>new1=new HashSet<>(Arrays.asList(arr));
        System.out.println(new1);
    }
}
