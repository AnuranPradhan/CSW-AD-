package AlgorithmDesign.Queue;

import java.util.Scanner;

public class QueueUsingArray {
public static final int MAX=10;
static int rear=-1;
static int front=-1;

public static boolean isFull(){
    return rear==MAX-1;
}
public static boolean isEmpty(){
    return (rear==-1||front==-1);
}

public static void insert(int[]Q){
if(isFull()){
    System.out.println("Queue is Full");
}else{
    @SuppressWarnings("resource")
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value you want to insert");
    int val=sc.nextInt();
    Q[++rear]=val;
    if(rear==0){
        front=0;
    }
}
}
public static void delete(int[]Q){
    if(isEmpty()){
        System.out.println("Queue is Empty");
    }else{
        System.out.println("The deleted element is "+Q[front]);
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front++;
        }
    }
}
public static void display(int[]Q){
if(isEmpty()){
    System.out.println("Queue is Empty");
}else{
    for(int i=front;i<=rear;i++){
        System.out.print(Q[i]+" ");
    }
    System.out.println();
}
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc =new Scanner(System.in);
    int []queue=new int[MAX];
    while(true){
        System.out.println("***MENU***");
        System.out.println("0: Exit");
        System.out.println("1: Insert");
        System.out.println("2: Delete");
        System.out.println("3: Display");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice){
            case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
        }
    }
}
}
