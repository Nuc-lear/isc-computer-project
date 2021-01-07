import java.util.*;
class Comp_Fibo
{
    int n;
    Comp_Fibo()
    {
        n=0;
    }

    void display()
    {

    }

    boolean chk_Composite(int n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==2)
            return false;
        else
            return true;
    }

    int chk_Fibo(int n)
    {
        int a=0,b=1;
        while(a<n)
        {
            //nt c=a+b;
            a=b;
            b=a+b;
            b=b-a;
            System.out.println(a+" "+b);
        }
        if(a==n)
            return 1;
        else
            return 0;
    }
}
