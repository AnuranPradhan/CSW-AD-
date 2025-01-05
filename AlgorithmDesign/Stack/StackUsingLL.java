package AlgorithmDesign.Stack;

import java.util.Scanner;

class Node{
    Node next;
    int val;
}
public class StackUsingLL {
   public static Node push(Node top){
    @SuppressWarnings("resource")
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the element you want to push");
    Node node =new Node();
    node.val=sc.nextInt();
    node.next=top;
    top=node;
    return top;
   }
   public static Node pop(Node top){
    if(top==null){
System.out.println("No Node is available");
    }else{
        System.out.println("Deleting the node "+top.val);
        top=top.next;
    }
    return top;
   }
   public static void display(Node top){
    if(top==null){
        System.out.println("The LinkedList is Empty");
    }else{
        Node temp=top;
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
    Node top;
    top=null;
    while(true){
        System.out.println("\n****MENU****");
                System.out.println("0:Exit");
                System.out.println("1:Push");
                System.out.println("2:Pop");
                System.out.println("3:Display");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                switch(choice){
                    case 0:
                    System.exit(0);
                    case 1:
                    top=push(top);
                    break;
                    case 2:
                    top=pop(top);
                    break;
                    case 3:
                    display(top);
                    break;
                    default:
                    System.out.println("You entered the wrong choice");
                }
    }
   }
}
