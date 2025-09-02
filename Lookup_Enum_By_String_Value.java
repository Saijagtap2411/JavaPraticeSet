package JavaPraticeQuestions;

public class Lookup_Enum_By_String_Value {
    public enum TextStyle {
        BOLD, ITALICS, UNDERLINE, STRIKETHROUGH
    }

    public static void main(String[] args) {
        String style="bold";
        TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());
        System.out.println(textStyle);
    }
}
