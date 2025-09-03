package JavaPraticeQuestions;
interface author{
    public void access();
}
class agent{
    public void login(String str){
        System.out.println(str+"should have login time as 9am sharp");
    }
}
public class Multiple_Inheritance extends agent implements author{
    public void access(){
        System.out.println("Admin have all the access!!!");
    }
    public static void main(String[]args){
        Multiple_Inheritance obj=new Multiple_Inheritance();
        obj.access();
        obj.login("agent1");
    }

}
