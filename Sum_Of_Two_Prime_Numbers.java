package JavaPraticeQuestions;

import java.util.Scanner;

public class Sum_Of_Two_Prime_Numbers {
    static boolean isPrime(int num){
        if(num<2)
            return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void represent(int n) {
        boolean found = false;
        for(int i=2;i <= n / 2;i++){
            if(isPrime(i) && isPrime(n-i)){
                System.out.println(n+"="+i+"+"+(n-i));
                found = true;
            }

        }
        if(!found){
            System.out.println(n+"cannot be expressed as the sum of two primes");
    }}
    public static void main(String[] args) {
        int n=34;
        represent(n);
    }
}
