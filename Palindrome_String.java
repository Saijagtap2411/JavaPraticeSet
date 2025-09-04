package JavaPraticeQuestions;

public class Palindrome_String {
    public static void main(String[] args) {
        String str="mam",revstr="";
        int Strlength=str.length();
        for(int i=(Strlength-1);i>=0;i--){
            revstr+=str.charAt(i);
        }
        if(str.equals(revstr)){
            System.out.println(str+" is Palindrome.");
        }
        else{
            System.out.println(str+" is not Palindrome.");
        }
    }
}
