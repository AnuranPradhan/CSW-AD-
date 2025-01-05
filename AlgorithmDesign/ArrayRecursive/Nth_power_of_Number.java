package AlgorithmDesign.ArrayRecursive;

public class Nth_power_of_Number {
static int NthPower(int base,int power){
    if(power==0){
        return 1;
    }
    return base*NthPower(base,power-1);
}
public static void main(String[] args) {
    System.out.println("The value of 2 to the power 4 is "+NthPower(2, 4));
}
}
