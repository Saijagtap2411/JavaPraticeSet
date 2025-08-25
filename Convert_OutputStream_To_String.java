package JavaPraticeQuestions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Convert_OutputStream_To_String {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String line="Hello world!";
        stream.write(line.getBytes());
        String finalString = new String(stream.toByteArray());
        System.out.println(finalString);
    }
}
