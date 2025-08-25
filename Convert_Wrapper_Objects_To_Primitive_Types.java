package JavaPraticeQuestions;

public class Convert_Wrapper_Objects_To_Primitive_Types {
    public static void main(String[] args) {
        Integer i=23;
        Double d=34.43;
        Boolean bool=false;

        int a=i.intValue();
        double b=d.doubleValue();
        boolean flag=bool.booleanValue();

        System.out.println("The value of int variable: " + a);
        System.out.println("The value of double variable: " + b);
        System.out.println("The value of boolean variable: " + flag);
    }
}
