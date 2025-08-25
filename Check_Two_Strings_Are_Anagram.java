package JavaPraticeQuestions;

import java.util.Arrays;

public class Check_Two_Strings_Are_Anagram {
    public static void main(String[] args){
        String n1="Coder";
        String n2="Coder";
        n1=n1.toLowerCase();
        n2=n2.toLowerCase();
        if(n1.length()==n2.length()){
        char[] a1=n1.toCharArray();
        char[] a2=n2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean result=Arrays.equals(a1,a2);
        if(result==true){
            System.out.println("Anagrams found");
        }else{
            System.out.println("Anagrams not found");
        }

        }
        else{
            System.out.println("Anagrams not found");
            }
    }
}
