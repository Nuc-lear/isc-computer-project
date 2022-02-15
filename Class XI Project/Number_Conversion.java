import java.util.*;
class Number_Conversion
{// start of class
    public static void binary(int k)
    {//function to convert to binary form
        if(k==0)//checking
            System.out.print("");
        else
        {
            int r=k%2;
            binary(k/2);
            System.out.print(r);
        }
    }

    public static void octal(int k)
    {//function to convert to octal form
        if(k==0)//checking
            System.out.print("");
        else
        {
            int r=k%8;
            octal(k/8);
            System.out.print(r);
        }
    }

    public static void hexa(int k)
    {//function to convert to hexadecimal form
        if(k==0)//checking
            System.out.print("");
        else
        {
            int r=k%16;
            if(r>=10)
                r=r+55;
            else
                r=r+48;
            hexa(k/16);
            System.out.print((char)r);
        }
    }

    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);//object creation
        System.out.println("Enter the number");
        int n=sc.nextInt();//to accept and store a number from user
        System.out.print("Equivalent Binary Form : ");
        binary(n);//calling function
        System.out.println();
        System.out.print("Equivalent Octal Form : ");
        octal(n);//calling function
        System.out.println();
        System.out.print("Equivalent Hexadecimal Form : ");
        hexa(n);//calling function
        System.out.println();
    }//end of main()
}//end of class