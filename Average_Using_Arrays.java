package JavaPraticeQuestions;

public class Average_Using_Arrays {
    public static void main(String[] args) {
        double[]array={45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum=0.0;
        for(double num:array){
            sum+=num;
        }
        double average=sum/array.length;
        System.out.printf("the average is :%.2f",average);
    }
}
