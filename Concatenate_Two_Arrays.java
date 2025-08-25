package JavaPraticeQuestions;

import java.util.Arrays;

public class Concatenate_Two_Arrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] addarray=new int[array1.length+array2.length];
        System.arraycopy(array1, 0, addarray, 0, array1.length);
        System.arraycopy(array2, 0, addarray, array1.length, array2.length);
        System.out.println(Arrays.toString(addarray));
    }
}
