package JavaPraticeQuestions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Append_Text_To_Existing_File {
    public static void main(String[] args) {
        String path=System.getProperty("user.dir")+ "\\src\\test.txt";
        String text="Newly Added";
        try{
            Files.write(Paths.get(path),text.getBytes(), StandardOpenOption.APPEND);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
