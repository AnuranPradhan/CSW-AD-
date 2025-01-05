package AlgorithmDesign.ArrayRecursive;

import java.util.Scanner;

public class Decimal_to_Hexadecimal {
    public static String dec2hex_recursive(int n)
    {
        if (n==0)
            return "";
        else
        {
            String w="";
            int d=n%16; //remainder

            if(d<=9) w+=d;
            if(d==10) w="A";
            if(d==11) w="B";
            if(d==12) w="C";
            if(d==13) w="D";
            if(d==14) w="E";
            if(d==15) w="F";

            return dec2hex_recursive(n/16)+w;

        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("It's hexadecimal representation is "+dec2hex_recursive(n));
    }
}
