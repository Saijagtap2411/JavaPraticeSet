package JavaPraticeQuestions;

public class Frequency_Of_Character {
    public static void main(String[] args) {
        String ch="welcome to the coding world";
        char ch1='o';
        int frequency=0;
        for(int i=0;i<ch.length();i++){
            if(ch1==ch.charAt(i)){
            frequency++;
        }}
        System.out.println(frequency);
    }
}
