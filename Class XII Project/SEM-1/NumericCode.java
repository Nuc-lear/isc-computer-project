/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
public class NumericCode
{//start of class
    public static void main()
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Coded Text = ");
        String s=sc.nextLine();//accepting the coded text
        int l=s.length();
        String w="", z="";
        int f=0, i, k=0;
        for(i=0;i<l;i++)//decoding the code
        {
            char ch=s.charAt(i);
            w=w+ch;
            int p=Integer.valueOf(w);//Converting to Integer
            if(p<10)
                continue;
            else if(p==32)
            {
                if(f==0)//checking
                {
                    z=z+" "; f=1; w="";
                }
                else
                {
                    w=""; continue;
                }
            }
            else
            {
                f=0;
                if((p>=65 && p<=90) || (p>=97 && p<=122))
                {
                    z=z+(char)p; w="";
                }
                else
                {
                    if(p>=10 && p<=12)
                        continue;
                    else
                        w="";
                }
            }
        }
        System.out.print("Decoded Text\t:\t");
        System.out.print(Character.toUpperCase(z.charAt(0)));
        for(i=1;i<z.length();i++)//Printing the Decoded Text
        {
            if(k==1)
            {
                System.out.print(Character.toUpperCase(z.charAt(i)));
                k=0; continue;
            }
            char ch=z.charAt(i);
            System.out.print(Character.toLowerCase(ch));
            if(ch==' ')
                k=1;
        }
        System.out.println();
    }//end of main()
}//end Of class