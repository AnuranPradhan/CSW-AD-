package AlgorithmDesign.ArrayRecursive;





public class Sum_of_n_numbers {
    static int Sum(int n,int[]arr){
    if(n==1){
        return arr[0];
    }
    return arr[n-1]+Sum(n-1, arr);
    }

    public static void main(String[] args) {
        int[]arr={12,23,12,123,33};
        int sum=Sum(0, arr);
        System.out.println("Sum of the elements of the array is "+sum);
    }
}
