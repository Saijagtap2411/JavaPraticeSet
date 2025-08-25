package JavaPraticeQuestions;

public class Check_An_Array_Contains_Given_Value {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int find=4;
        boolean flag=false;
        for(int i:num){
            if(i==find){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println(find +" is found");

        }
        else{
            System.out.println(find +" is not found");
        }
    }
}
