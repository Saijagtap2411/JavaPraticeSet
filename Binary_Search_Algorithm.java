package JavaPraticeQuestions;

import java.util.Scanner;

public class Binary_Search_Algorithm {

    int binarysearch(int[]array,int element , int low,int high){
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==element){
                return mid;
            }
            if(element>array[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;

    }


    public static void main(String[] args) {
Binary_Search_Algorithm bsa = new Binary_Search_Algorithm();
        int[] array = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be searched:");
        int element = sc.nextInt();
        int result = bsa.binarysearch(array,element,0,n-1);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result);
        }
    }
}
