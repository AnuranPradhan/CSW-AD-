package AlgorithmDesign.Stack;

import java.util.Scanner;


public class StackUsingArray {
    public static final int MAX=10;
public static boolean isFull(int top){
    return top==MAX-1;
}
public static boolean isEmpty(int top){
    return top==-1;
}

public static int push(int top,int item,int[]S){
    if(isFull(top)){
        System.out.println("Stack is Full");
    }else{
        S[++top]=item;
    }
    return top;
}
public static int pop(int top,int[]S){
    if(isEmpty(top)){
        System.out.println("Stack is Empty");
    }else{
        System.out.println("Popped element is"+S[top]);
       top--;
        
    }
    return top;
}
public static void display(int top, int[]S){
    for(int i=0;i<=top;i++){
        System.out.print(S[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc =new Scanner(System.in);
    int[] stack=new int[MAX];
    int top=-1;
    while(true){
        System.out.println("***MENU***");
        System.out.println("0: Exit");
        System.out.println("1: Push");
        System.out.println("2: Pop");
        System.out.println("3: Display");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();

        switch(choice){
            case 0:
            System.exit(0);
            case 1:
            top=push(top,23,stack);
            break;
            case 2:
            top=pop(top,stack);
            break;
            case 3:
            display(top,stack);
            break;
           default:
           System.out.println("Invalid Choice");
        }
    }
}
}
