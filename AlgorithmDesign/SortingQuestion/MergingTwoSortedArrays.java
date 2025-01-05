import java.util.Arrays;

public class MergingTwoSortedArrays {
   static void merge(int[]arr,int[]arr1){
    int left=arr.length-1;
    int right=0;
    while(left>=0 && right<arr1.length){
        if(arr[left]>arr1[right]){
            int temp=arr[left];
            arr[left]=arr1[right];
            arr1[right]=temp;
        }else{
            break;
        }
    }
    Arrays.sort(arr);
    Arrays.sort(arr1);
   }

    
public static void main(String[] args) {
    int[]arr={12,23,34,56};
    int[]arr1={23,45,67,89};
    merge(arr, arr1);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");
    }
}
}
