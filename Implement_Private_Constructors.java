package JavaPraticeQuestions;

public class Implement_Private_Constructors {
    private Implement_Private_Constructors(){
        System.out.println("This is private constructor!!!");
    }

    public static void instanceMethod(){
        Implement_Private_Constructors c = new Implement_Private_Constructors();
    }



    public static void main(String[]args){
        Implement_Private_Constructors.instanceMethod();
    }
}
