import java.util.*;
class Number_System
{//start of class
    int p,s;//initialize
    Number_System()
    {
        p=0;
        s=0;
    }

    public void bin_deci(int n)
    {//to convert binary number to decimal number

        if(n==0)
            System.out.print("Decimal Number "+s);
        else
        {
            int d=n%10;
            s=s+d*(int)Math.pow(2,p);
            p++;
            n=n/10;
            bin_deci(n);

        }
    }

    public void  deci_bin(int n)
    {//to convert decimal number to binary number
        if(n==0)//0
            System.out.print("Binary Number ");
        else
        {
            int d=n%2;
            n=n/2;
            deci_bin(n);
            System.out.print(d); 
        }
    }

    public static void main()
    {//start of main() method
        Scanner sc= new Scanner(System.in);
        Number_System ob= new Number_System();
        System.out.println("1 for Binary to Decimal ");
        System.out.println("2 for Decimal to Binary ");
        System.out.print("Enter the choice : ");
        int ch=sc.nextInt();

        switch(ch)
        {//choice

            case 1:// to convert binary number to decimal number
            System.out.print("Enter Binary Number : ");
            int b=sc.nextInt();
            ob.bin_deci(b);
            System.out.println();
            break; 

            case 2:// to convert decimal number to binary number
            System.out.print("Enter Decimal Number : ");
            int d=sc.nextInt();
            ob.deci_bin(d);
            System.out.println();
            break;

            default:
            System.out.println("Wrong choice ");
        }
    }//end of main() method
}//end of class