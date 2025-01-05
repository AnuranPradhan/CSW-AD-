package AlgorithmDesign;

public class Nth_Fibbonacci {
static int Fibo(int n){
    if(n<2){
        return n;
    }
    return Fibo(n-2)+Fibo(n-1);
}
public static void main(String[] args) {
    System.out.println("The 5th fibbonacci number is "+Fibo(5));
}
}
