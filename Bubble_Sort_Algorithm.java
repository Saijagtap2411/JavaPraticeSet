package JavaPraticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort_Algorithm {
    Scanner sc = new Scanner(System.in);
    void bubblesort(int[]array)
    {
        int size=array.length;
        System.out.println("Choose Sorting Order:");
        System.out.println("1 for Ascending \n2 for Descending");
        int sortOrder = sc.nextInt();
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(sortOrder==1){
                    if(array[j]>array[j+1]){
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }

                }
                else{
                    if(array[j]<array[j+1]){
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        Bubble_Sort_Algorithm obj = new Bubble_Sort_Algorithm();
        obj.bubblesort(data);
        System.out.println("The sorted array is: "+ Arrays.toString(data));
    }
}
