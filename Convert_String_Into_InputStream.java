package JavaPraticeQuestions;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Convert_String_Into_InputStream {
    public static void main(String[] args) {
        String name="Coder";
        System.out.println("String is: " + name);

        try{
            InputStream stream=new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
            System.out.println("InputStream: " + stream);
            System.out.println("Available bytes at the beginning: " + stream.available());
            stream.read();
            stream.read();
            stream.read();
            System.out.println("Available bytes at the end: " + stream.available());

            stream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
