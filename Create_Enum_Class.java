package JavaPraticeQuestions;

public enum Create_Enum_Class {
    SMALL, MEDIUM, LARGE, EXTRALARGE;
    public String getsize(){
        switch(this){
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extralarge";

            default:
                return "Null";
        }
    }
    public static void main(String[]args)
    {
        System.out.println(Create_Enum_Class.SMALL.getsize());
    }
}
