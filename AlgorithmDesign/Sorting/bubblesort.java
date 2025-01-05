public class bubblesort {

static void Bubble_sort(int[]arr,int n){
    for(int i=arr.length-1;i>=1;i--){
        int swap=0;
      for(int j=0;j<i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp =arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swap=1;
        }
      }
      if(swap==0){
        break;
      }
    }
}

public static void main(String[]args){
int []arr={12,21,34,53,42,78};
Bubble_sort(arr,arr.length);
for(int k=0;k<arr.length;k++){
    System.out.print(arr[k]+" ");
}
}


}
