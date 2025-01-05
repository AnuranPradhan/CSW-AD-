package AlgorithmDesign.SearchingQuestions;

public class print_duplicate {
    static void PrintDuplicate(int[]arr){
        boolean checked[]=new boolean[arr.length/2];
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&& !checked[i] && !checked[j]){
                    System.out.print(arr[i]+" ");
                }
                if(arr[i]==arr[j]){
                    checked[i]=true;
                    checked[j]=true;

                }
             }
        }
    }
    public static void main(String[] args) {
    int[]arr={12,24,2324,566,2345,232,12};
    PrintDuplicate(arr);
    
}
}
