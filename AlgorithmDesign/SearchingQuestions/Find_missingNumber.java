package AlgorithmDesign.SearchingQuestions;

import java.util.Scanner;

public class Find_missingNumber {
    static int FindMissing(int[]arr){
        int n=arr.length;
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<arr.length;i++){
            s2+=arr[i];
        }
        return sum-s2;
    }
public static void main(String[] args) {
     @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        System.out.println("Enter "+(n-1)+" array elements between 1 and "+n+" with one number missing");
        System.out.println("The missing number is "+FindMissing(arr));
}
}
