package JavaPraticeQuestions;
final class Immutable{
    private String name;
    private int date;

    Immutable(String name, int date){
        this.name = name;
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public int getDate(){
        return date;
    }
}
public class Create_Immutable_Class {

    public static void main(String[] args) {
        Immutable n=new Immutable("Coder",2025);
        System.out.println(n.getName());
        System.out.println(n.getDate());
    }

}
