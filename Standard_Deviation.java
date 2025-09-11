package JavaPraticeQuestions;

public class Standard_Deviation {
    public static void main(String[] args) {
        double[]array={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sd=calculatesd(array);
        System.out.format("the sd is :- %.6f",sd);
    }
    public static double calculatesd(double[] array) {
        double sum=0.0,standarddeviation=0.0;
        int length=array.length;
        for(double num:array){
            sum+=num;
        }
        double mean=sum/length;
        for(double num:array){
            standarddeviation+=Math.pow(num-mean,2);
        }
        return Math.sqrt(standarddeviation/length);
    }
}
