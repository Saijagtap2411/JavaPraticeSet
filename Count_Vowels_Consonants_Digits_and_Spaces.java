package JavaPraticeQuestions;

import java.util.Scanner;

public class Count_Vowels_Consonants_Digits_and_Spaces {
    public static void main(String args[]) {
        String str="This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
            else if(ch>='0'  && ch<='9'){
                digits++;
            }
            else if(ch==' '){
                spaces++;
            }
        }
        System.out.println("Number of vowels are:- "+vowels);
        System.out.println("Number of cononants are:- "+consonants);
        System.out.println("Number of digits are:-"+digits);
        System.out.println("Number of spaces are:-"+spaces);
    }
}
