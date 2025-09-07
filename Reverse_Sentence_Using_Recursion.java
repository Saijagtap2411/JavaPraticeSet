package JavaPraticeQuestions;

public class Reverse_Sentence_Using_Recursion {
    public static void main(String[]args){
        String sentence="hello developer";
        String rev=reversesentence(sentence);
        System.out.println(rev);
    }
    public static String reversesentence(String sentence){
        if(sentence.isEmpty())
            return sentence;

            return reversesentence(sentence.substring(1))+sentence.charAt(0);

    }
}
