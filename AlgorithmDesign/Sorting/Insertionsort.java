public class Insertionsort {


    static void Insertion_sort(int[]arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
public static void main(String[] args) {
    int []arr={12,34,23,89,12,21};
  Insertion_sort(arr,arr.length);
  for(int k=0;k<arr.length;k++){
    System.out.print(arr[k]+" ");
  }
}
}
