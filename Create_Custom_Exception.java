package JavaPraticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}


public class Create_Custom_Exception {
    ArrayList<String> languages=new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
    public void checklanguage(String language) throws CustomException{
        if(language.contains(language)){
            throw new CustomException(language+"this language is already present");
        }
        else{
            languages.add(language);
            throw new CustomException(language+"this language is new and its added to the list");
        }
    }
    public static void main(String[]args){
        Create_Custom_Exception a=new Create_Custom_Exception();
        try{
            a.checklanguage("Java");
            a.checklanguage("PHP");
        }
        catch(CustomException e){
            System.out.println("[" + e + "] Exception Occured");


        }
    }
}
