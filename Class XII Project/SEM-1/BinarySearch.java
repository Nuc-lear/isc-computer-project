/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class BinarySearch
{//start of class
    int a[],size;//initialize
    Scanner sc=new Scanner(System.in);
    BinarySearch(int s)//parameterized constructor
    {
        size=s;//initialize
        a=new int[size];//initialize
    }

    void accept()//to accept the number from user
    {
        System.out.println("Enter number in ascending order ");
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the number : ");
            a[i]=sc.nextInt();//to store numbers in an array from user
        }
    }

    void check()//to check if number is present or not
    {
        System.out.print("Enter the search number : ");
        int num=sc.nextInt();//to store search number from user
        if(search(0,size-1,num)==true)
            System.out.println("Number Present");
        else
            System.out.println("Number not Present");
    }

    public boolean search(int b, int e, int num)//to search for the number using Binary Search 
    {
        if(b>e)//checking 
            return false;
        else
        {
            int m=(b+e)/2;//middle index
            if(a[m]==num)
                return true;
            else if(num>a[m])
                return search(m+1,e,num);
            else
                return search(b,m-1,num);
        }
    } 

    public static void main(String args[])
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n=sc.nextInt();//to store order 
        BinarySearch ob=new BinarySearch(n);
        ob.accept();
        ob.check();
    }//end of main()
}//end of class