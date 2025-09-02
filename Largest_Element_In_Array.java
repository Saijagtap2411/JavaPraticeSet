package JavaPraticeQuestions;

public class Largest_Element_In_Array {
    public static void main(String[] args) {
        double[]array={23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
        double largest=array[0];
        for(double num:array){
            if(largest<num)
                largest=num;
        }
        System.out.printf("the largest of array elemest is :%.2f",largest);

    }
}
