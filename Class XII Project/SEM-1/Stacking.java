/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class Stacking
{//start of class
    int stk[];//initialize
    int size, top;//initialize
    Stacking(int cap)//parameterized constructor
    {
        size=cap;//initialize
        top=-1;//initialize
        stk=new int[size];//initialize
    }

    void push()//to enter a number in the stack
    {
        Scanner sc=new Scanner(System.in);
        if(top==size-1)//checking
            System.out.println("OVERFLOW");
        else
        {
            System.out.print("Enter Number : ");
            int num=sc.nextInt();
            top=top+1;//increment pointer
            stk[top]=num;
        }
    }

    void pop()//to delete a number from the stack
    {
        if(top==-1)//checking
            System.out.println("UNDERFLOW");
        else
        {
            System.out.println("Deleted : "+stk[top--]);
        }
    }

    void display()//to display the stack
    {
        System.out.println("Elements are ");
        for(int i=top;i>=0;i--)
            System.out.println(stk[i]);
    }

    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size : ");
        int s=sc.nextInt();
        Stacking ob=new Stacking(s);
        while(true)//checking
        {
            System.out.println("1 for Push ");
            System.out.println("2 for Pop ");
            System.out.println("3 for Display ");
            System.out.println("4 for Exit ");
            System.out.print("Enter the choice : ");
            int ch=sc.nextInt();//to accept choce of the user
            switch(ch)
            {//start of switch case
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
            }//end of switch case
        }

    }//end of main()
}//end of class