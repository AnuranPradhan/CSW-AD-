package AlgorithmDesign.Searching;

import java.util.Scanner;

public class BinarySearch_with_recursion {

static int BinarySearch_Rec(int[]arr, int key,int left,int right){
  if(left>right){
    return -1;
  }
        int mid=(left+right)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            return BinarySearch_Rec(arr, key, mid+1, right);
        }
        else{
            return BinarySearch_Rec(arr, key,left,mid-1);
        }
    }
    


public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array in ascending order : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key to search : ");
        int key=sc.nextInt();

        int index=BinarySearch_Rec(arr,key,0,arr.length-1);

        if(index==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at index "+index);
    }

    }
}
