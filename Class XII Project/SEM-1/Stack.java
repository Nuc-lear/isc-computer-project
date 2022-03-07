/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class Node
{
    int data;
    Node link;
    Node()// constructor
    {
        data=0;
        link=null;
    }

    Node(int d, Node m)
    {
        data=d;
        link=m;
    }
}// end of class
public class Stack
{
    Node start; //declare start node
    Stack()
    {
        start=null; // initialize
    }
    void push()
    {
        Scanner sc= new Scanner(System.in);
        Node temp=new Node();
        System.out.print("Enter the data : ");
        temp.data=sc.nextInt();
        if(start==null)//empty list
            start=temp;// insert at first
        else
        {
            temp.link=start; //add new node at first
            start=temp;
        }
    }

    void pop()
    {
        if(start==null)//empty list
            System.out.println("UNDERFLOW");
        else
        {
            System.out.println("Delete : "+start.data);
            start=start.link; //move the pointer to the next node
        }
    }

    void display()
    {
        Node temp=start; // initialize
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;//move the pointer to the next node
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Stack ob=new Stack(); //creation of object
        while(true)
        {
            System.out.println("1 for PUSH ");
            System.out.println("2 for POP ");
            System.out.println("3 for DISPLAY ");
            System.out.println("4 for EXIT ");
            System.out.print("Enter choice : ");
            int ch=sc.nextInt(); //store the choice from user

            switch(ch)
            {
                case 1:
                ob.push();
                break;

                case 2:
                ob.pop();
                break;

                case 3:
                ob.display();
                break;

                case 4:
                System.exit(1);

                default:
                System.out.println("Wrong choice ");
            }// end of switch
        }// end of while
    } // end of main method
}// end of class