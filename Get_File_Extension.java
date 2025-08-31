package JavaPraticeQuestions;

import java.io.File;

public class Get_File_Extension {
    public static void main(String[] args) {
        File file=new File("test.txt");
        String filename=file.toString();
        int index=filename.lastIndexOf('.');
        if(index>0){
            String extension=filename.substring(index+1);
            System.out.println(extension);
        }
    }
}
