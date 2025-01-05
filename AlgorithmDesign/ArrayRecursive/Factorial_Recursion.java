package AlgorithmDesign.ArrayRecursive;

public class Factorial_Recursion {


    static int Fact(int n){
        if(n<2){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("The Factorial of number 5 is "+Fact(5));
    }
}
