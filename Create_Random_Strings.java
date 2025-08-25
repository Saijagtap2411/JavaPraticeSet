package JavaPraticeQuestions;

import java.util.Random;

public class Create_Random_Strings {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s=new StringBuilder();
        Random rand=new Random();
        int length=7;
        for(int i=0;i<length;i++){
            int index=rand.nextInt(alphabet.length());
            char  ch=alphabet.charAt(index);
            s.append(ch);
        }
        String randomString=s.toString();
        System.out.println("Random String is: " + randomString);
    }
}
