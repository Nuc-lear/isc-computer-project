 /*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class BouncyNumber
{//start of class
    public static void main()
    {//start of main()
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();//to accept and store the number from user
        String num=Integer.toString(a);//to convert the number to string
        int in=1,dc=1;//initialize
        for(int i=0;i<num.length()-1;i++)
        {
            char ch=num.charAt(i);//to store first character
            char ch2=num.charAt(i+1);//to store second character
            if(ch<=ch2)//checking
                in++;
            if(ch>=ch2)//checking
                dc++;
        }
        if(in==num.length())//checking
            System.out.println("The number "+a+" is Increasing and Not Bouncy");
        else if(dc==num.length())
            System.out.println("The number "+a+" is Decreasing and Not Bouncy");
        else
            System.out.println("The number "+a+" is Bouncy");

    }//end of main()
}//end of class