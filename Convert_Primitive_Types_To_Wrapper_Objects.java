package JavaPraticeQuestions;

public class Convert_Primitive_Types_To_Wrapper_Objects {
    public static void main(String[] args) {
        int a=23;
        double b=34.45D;
        boolean flag=false;

        Integer i=Integer.valueOf(a);
        Double d=Double.valueOf(b);
        Boolean bool=Boolean.valueOf(flag);

        if(i instanceof Integer){
            System.out.println("An object of Integer is created.");
        }

        if(d instanceof Double){
            System.out.println("An object of Double is created.");
        }

        if(bool instanceof Boolean){
            System.out.println("An object of Boolean is created.");
        }
    }
}
