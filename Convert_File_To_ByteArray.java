package JavaPraticeQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Convert_File_To_ByteArray {
    public static void main(String args[]){
        String path=System.getProperty("user.dir")+ "\\src\\test.txt";
        try{
            byte[]bytes= Files.readAllBytes(Paths.get(path));
            System.out.println(Arrays.toString(bytes));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
