/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class Queue
{//start of class
    int Q[];//initialize
    int size, front, rear;//initialize
    Queue(int cap)//parameterized constructor
    { 
        size=cap;//initialize
        front=0;//initialize
        rear=0;//initialize
        Q=new int[size];//initialize
    }

    void Insert()//to insert a number in a queue
    {
        Scanner sc=new Scanner(System.in);
        if(rear==size)//checking
            System.out.println("Queue is Full");
        else
        {
            System.out.print("Enter Number : ");
            int num=sc.nextInt();
            Q[rear]=num;//add item at queue
            rear++;//increment
        }
    }

    void Delete()//to delete a number from the queue
    {
        if(front==rear)//checking
            System.out.println("Queue is Empty");
        else
        {
            System.out.println("Deleted : "+Q[front]);
            if(front+1==rear)// only single element
            {
              front=0;//initialize
              rear=0;//initialize
            }
            else
             front++;
        }
    }

    void display()//to display the queue
    {
        System.out.println("Elements are ");
        for(int i=front;i<rear;i++)
            System.out.println(Q[i]);
    }

    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size : ");
        int s=sc.nextInt();//to accept the size of the queue from user
        Queue ob=new Queue(s);
        while(true)
        {//start of while loop
            System.out.println("1 for Insert ");
            System.out.println("2 for Delete ");
            System.out.println("3 for Display ");
            System.out.println("4 for Exit ");
            System.out.print("Enter the choice : ");
            int ch=sc.nextInt();//to accept the choce of the user
            switch(ch)
            {//start of switch case
                case 1:
                ob.Insert();//method call
                break;

                case 2:
                ob.Delete();//method call
                break;

                case 3:
                ob.display();//method call
                break;

                case 4:
                System.exit(1);//method call

                default:
                System.out.println("Wrong choice ");
            }//end of switch case
        }//end of while loop

    }//end of main()
}//end of class