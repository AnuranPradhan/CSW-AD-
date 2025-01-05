package AlgorithmDesign.Searching;

public class LinearSearch_with_recursion {
    static int LinearSearchWithRec(int []arr,int key,int i){
      if(i==arr.length){
        return -1;
      }
      if(arr[i]==key){
        return i;
      }
      return LinearSearchWithRec(arr, key, i+1);
    }

public static void main(String[] args) {
    int[]arr={12,2,4,34,67,354,89,23};
    int key=89;
    int p=LinearSearchWithRec(arr, key,0);
    if(p == -1){
        System.out.println("element not found");
    }else{
        System.out.println("the element is in "+p +" position");
    }
}

}
