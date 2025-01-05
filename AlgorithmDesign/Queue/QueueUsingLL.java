package AlgorithmDesign.Queue;

import java.util.Scanner;

class Node{
    Node next;
    int val;
}
public class QueueUsingLL {
 static Node rear,front;
 public static void insert(){
Node node = new Node();
@SuppressWarnings("resource")
Scanner sc =new Scanner(System.in);
System.out.println("Enter the item you want to insert ");
node.val=sc.nextInt();
if(front==null){
    front=rear=node;
}else{
    rear.next=node;
    rear=node;
}
 }
 public static void delete(){
    if(front==null){
        System.out.println("Queue Underflow");
    }else{
    System.out.println("Deleted item is "+front.val);
    front=front.next;
    }
    if(front==null){
        rear=null;
    }
 }
 public static void display(){
    if(front==null){
        System.out.println("Queue is underflow");
    }else{
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
System.out.println();
    }
 }
 public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc =new Scanner(System.in);
    while(true){
        System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);

                case 1:
                    insert();
                    break;

                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
    }
 }
}
