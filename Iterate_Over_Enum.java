package JavaPraticeQuestions;
enum Languages{
    JAVA,PYTHON,PHP,REACT,JS;
}
public class Iterate_Over_Enum {
public static void main(String[] args) {
    System.out.println("The enum constants are:- ");
    for(Languages languages : Languages.values()){
        System.out.println(languages);
    }
}
}
