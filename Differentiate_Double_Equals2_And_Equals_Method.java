package JavaPraticeQuestions;

public class Differentiate_Double_Equals2_And_Equals_Method {
    public static void main(String[] args) {
        String str1=new String("abcdefg");
        String str2=new String("abcdefg");

        System.out.println("Check two ways strings are equal");

        boolean result1=str1.equals(str2);
        System.out.println("Using equals(): " + result1);

        boolean result2=(str1==str2);
        System.out.println("Using == operator: " + result2);


    }
}
