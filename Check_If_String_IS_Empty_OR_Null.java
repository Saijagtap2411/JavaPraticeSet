package JavaPraticeQuestions;

public class Check_If_String_IS_Empty_OR_Null {
    public static void main(String[] args) {
        String str="wow";
        String str1=null;
        String str2="";
        if(str==null){
            System.out.println("str is null");
        }
        else if(str.isEmpty()){
            System.out.println("str is empty");
        }
        else{
            System.out.println("Str is neither empty nor null i has some value!!!");
        }

        if(str1==null){
            System.out.println("str1 is null");
        }
        else if(str1.isEmpty()){
            System.out.println("str1 is empty");
        }
        else{
            System.out.println("Str1 is neither empty nor null i has some value!!!");
        }

        if(str2==null){
            System.out.println("str2 is null");
        }
        else if(str2.isEmpty()){
            System.out.println("str2 is empty");
        }
        else{
            System.out.println("Str2 is neither empty nor null i has some value!!!");
        }
    }
}
