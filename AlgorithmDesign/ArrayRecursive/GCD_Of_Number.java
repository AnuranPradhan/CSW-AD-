package AlgorithmDesign.ArrayRecursive;

public class GCD_Of_Number {
static int GCD(int n, int m){
    if(m==0){
        return m;
    }
    return GCD(n,n%m);
}
public static void main(String[] args) {
    System.out.println("GCD of 2 and 4 is"+GCD(2,4));
}
}
