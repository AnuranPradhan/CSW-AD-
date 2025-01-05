package AlgorithmDesign.SearchingQuestions;

import java.util.Arrays;

public class first_repeat_element {

static int FirstRepeat(int[]arr){
    Arrays.sort(arr);



    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            return arr[i];
        }
    }
    return -1;
}
    public static void main(String[] args) {
       int[]arr={1,1,2,3,4,5,6,87};
       int repeat=FirstRepeat(arr);
       System.out.println(repeat);
    }
// Time complexity O(nlogn);
}
