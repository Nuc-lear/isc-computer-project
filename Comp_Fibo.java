import java.util.*;
class Comp_Fibo
{
    static int n;
    Comp_Fibo()//class declaration
    {
        n=0;
    }

    boolean chk_Composite(int n)//boolean checking function
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)

                return true;
        }
        return false;
    }

    int chk_Fibo(int n)//method to check for presence in the fibonacci series
    {
        int p =(int)Math.sqrt(5*(n*n)+4);
        int q =(int)Math.sqrt(5*(n*n)-4);
        if(p*p==(5*n*n+4)|| q*q==(5*n*n-4))
            return 1;
        else
            return 0;
    }

    void display(int num)//method to display the resultant numbers
    {
        System.out.print(num +" ");
    }

    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        Comp_Fibo ob=new Comp_Fibo();//object creation
        System.out.println("Enter value of n:");
        n=sc.nextInt();
        int i,b;boolean a;
        System.out.println("Composite fibonacci numbers are:");
        for(i=1;i<=n;i++)//no generation between 1 & n
        {
            a=ob.chk_Composite(i);
            b=ob.chk_Fibo(i);
            if(a==true && b==1)
                ob.display(i);
        }
    }
}//end of class