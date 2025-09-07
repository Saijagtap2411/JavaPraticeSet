package JavaPraticeQuestions;

public class Remove_All_Whitespaces_From_String {
    public static void main(String[] args) {
        String str="t his is t he c odi ng wor ld";
        System.out.println("Original String: "+str);
        str=str.replaceAll("\\s","");
        System.out.println("New String: "+str);
    }
}
