package AlgorithmDesign.Searching;

public class LinearSearch_without_recursion {
 static int LinearSearch(int[]arr,int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
 }


public static void main(String[] args) {
    int[]arr={12,2,4,34,67,354,89,23};
    int key=89;
    int p=LinearSearch(arr, key);
    if(p == -1){
        System.out.println("element not found");
    }else{
        System.out.println("the element is in "+p +" position");
    }
}
}
