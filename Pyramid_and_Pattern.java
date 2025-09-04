package JavaPraticeQuestions;

public class Pyramid_and_Pattern {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        System.out.println("-----------------------------------------------------");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------");
        char lastalpha='E',firstalpha='A';
        for(int i=1;i<=(lastalpha-'A'+1);i++){
            for(int j=1;j<=i;j++){
                System.out.print(firstalpha+"");
            }
            firstalpha++;
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------");

        char lalpha='E';

        for(int i=(lalpha-'A'+1);i>=1;i--){
            char falpha=(char)('A' + i - 1);
            for(int j=1;j<=i;j++){
                System.out.print(falpha+"");
            }

            System.out.println(" ");
        }
    }
}
