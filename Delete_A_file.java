package JavaPraticeQuestions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Delete_A_file {
    public static void main(String args[]) {

        File file = new File("final.txt");


        boolean value = file.delete();
        if(value) {
            System.out.println("final.txt is successfully deleted.");
        }
        else {
            System.out.println("File doesn't exit");
        }


//        Path path= Paths.get("final.txt");
//        try{
//            Files.delete(path);
//            System.out.println("final.txt is successfully deleted.");
//
//        }
//        catch (NoSuchFieldError e){
//            System.out.println("final.txt file not found.");
//        }
//        catch (IOException e){
//            System.out.println("Failed to delete final.txt: " + e.getMessage());
//        }
   }
}
