package JavaPraticeQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutations_Of_String {
    public static Set<String> getpermutations(String str){
        Set<String> permutations=new HashSet<String>();
        if(str==null){
            return null;
        }
        else if(str.length()==0){
            permutations.add("");
            return permutations;
        }
        char first=str.charAt(0);
        String sub = str.substring(1);

        Set<String> set=getpermutations(sub);
        for(String s:set){
            for(int i=0;i<=s.length();i++){
                permutations.add(s.substring(0,i)+first+s.substring(i));
            }
        }
        return permutations;
    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String data = sc.nextLine();
        System.out.println("Permutations of " + data + ": \n" + getpermutations(data));
    }
}
