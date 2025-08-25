package JavaPraticeQuestions;

import java.io.*;

public class Convert_InputStream_To_String {
    public static void main(String[] args) throws IOException {
        InputStream stream=new ByteArrayInputStream("Hello".getBytes());
        StringBuilder build=new StringBuilder();
        String line;
        BufferedReader br=new BufferedReader(new InputStreamReader(stream));
        while((line=br.readLine())!=null){
            build.append(line);
        }
        System.out.println(build);
    }
}
