package JavaPraticeQuestions;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Create_String_From_File {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+ "\\src\\test.txt";
        Charset encoding=Charset.defaultCharset();
        List<String> lines= Files.readAllLines(Paths.get(path),encoding);
        System.out.println(lines);
    }
}
