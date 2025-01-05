

public class selectionsort {


    static void Selection_sort(int[]arr,int n){
        for(int i=0;i<n-1;i++){
       int min=i;
       for(int j=i+1;j<n;j++){
        if(arr[min]>arr[j]){
            min=j;
        }
       }
       int temp=arr[min];
       arr[min]=arr[i];
       arr[i]=temp;
        }
    }
public static void main(String[] args) {
   int []arr={12,34,23,89,12,21};
   Selection_sort(arr,arr.length);
  for(int k=0;k<arr.length;k++){
    System.out.print(arr[k]+" ");
  }
}
}
