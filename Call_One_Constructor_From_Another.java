package JavaPraticeQuestions;

public class Call_One_Constructor_From_Another {
    int sum;
    Call_One_Constructor_From_Another(){
        this(5,5);
    }
    Call_One_Constructor_From_Another(int a,int b){
        this.sum=a+b;
    }
    void display(){
        System.out.println("The sum is: "+ sum);
    }




    public static void main(String[] args){
    Call_One_Constructor_From_Another c = new Call_One_Constructor_From_Another();
    c.display();
    }
}
