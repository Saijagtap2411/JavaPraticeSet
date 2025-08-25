package JavaPraticeQuestions;

public class Clear_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello World.");
        sb.append("This is Coding World.");
        System.out.println("Orginal is:"+sb.toString());
        sb.delete(0, sb.length());
        System.out.println("Updated is:"+sb.toString());
    }
}
