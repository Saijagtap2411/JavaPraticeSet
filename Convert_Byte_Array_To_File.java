package JavaPraticeQuestions;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Convert_Byte_Array_To_File {
    public static void main(String[] args) {
        String path=System.getProperty("user.dir")+ "\\src\\test.txt";
        String finalpath=System.getProperty("user.dir")+ "\\src\\final.txt";
        try{
            byte[] encoded= Files.readAllBytes(Paths.get(path));
            Files.write(Paths.get(finalpath),encoded);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
