package AlgorithmDesign.ArrayRecursive;

import java.util.Scanner;

public class Maximum_Minimum_of_Array {
    //Maximum using Linear Search
static int MaximumLS(int[]arr,int n){
    
if(n==1){
    return arr[0];
}
return Math.max(arr[n-1], MaximumLS(arr, n-1));
}


//Minimum Using Linear Search
static int MinimumLS(int[]arr,int n){
if(n==1){
    return arr[0];
}
return Math.min(arr[n-1], MaximumLS(arr, n-1));
}


//Maximum using Binary Search
static int MaximumBS(int[]arr,int start,int end){
    if(arr[start]==arr[end]){
        return arr[start];
    }
    int mid=(start+end)/2;
    int max1=MaximumBS(arr, start, mid);
    int max2=MaximumBS(arr, mid+1, end);
    return Math.max(max1, max2);
}
//Minimum using Binary Search
static int MinimumBS(int[]arr,int start,int end){
    if(arr[start]==arr[end]){
        return arr[start];
    }
    int mid=(start+end)/2;
    int min1=MinimumBS(arr, start, mid);
    int min2=MinimumBS(arr, mid+1, end);
    return Math.max(min1, min2);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array(n) : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" integers");
        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();
        sc.close();
       int max=MaximumBS(arr,0,n-1);
       int min=MinimumBS(arr,0,n-1);
        System.out.println("Maximum element in the array is : "+max);
        System.out.println("Minimum element in the array is : "+min);
}
}
