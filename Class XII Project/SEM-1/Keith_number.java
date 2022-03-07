/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
 */
import java.util.*;
class Keith_number
{//start of class
    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();//to accept and store the number from user
        String num=Integer.toString(n);// convert integer to string
        int l=num.length();//to calculate length of the string
        int a[]=new int[l];
        int cpy=n;
        int i=l-1;//to store the last index
        while(n>0)//checking
        {
            int d=n%10;
            a[i]=d;
            i--;
            n=n/10;
        }
        int s=0;//initialize
        while(true)
        {
            s=0;
            for( i=0;i<l;i++)//loop
                s=s+a[i];
            if(s<cpy)
            {
                for(i=0;i<l-1;i++)
                    a[i]=a[i+1];
                a[l-1]=s;// place sum of the elements at last
            }
            else
                break;
        }
        if(s==cpy)
            System.out.println("Keith Number ");
        else
            System.out.println("Not a Keith Number ");
    }//end of main()
}//end of class