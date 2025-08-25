package JavaPraticeQuestions;

public class Capitalize_First_Character_Of_Each_Word_String {
    public static void main(String[] args) {
        String str="coder";
        String firstletter=str.substring(0,1);
        String restletter=str.substring(1,str.length());
        firstletter=firstletter.toUpperCase();
        str=firstletter+restletter;
        System.out.println(str);
    }
}
