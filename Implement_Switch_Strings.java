package JavaPraticeQuestions;

public class Implement_Switch_Strings {
    public static void main(String[] args) {
        String str="hi";

        switch(str){
            case "hi":
                System.out.println("hi user!");
                break;
            case "hello":
                System.out.println("hello user!");
                break;
            case "hey":
                System.out.println("hey user!");
                break;
            default:
                System.out.println("Typo in message");
        }
    }
}
