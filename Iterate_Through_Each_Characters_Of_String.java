package JavaPraticeQuestions;

public class Iterate_Through_Each_Characters_Of_String {
    public static void main(String[] args) {
        String str="abcdefg";
        System.out.println("orginal string is: "+str);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.print(c+" ");
        }
    }
}
