import java.util.*;
class FiboSeries
{//start of class
    public static int fibo(int n)
    {
        if(n==0 || n==1)//checking
            return n;
        else
            return (fibo(n-1)+fibo(n-2));
    }

    public static void main()
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int a=1,b;//initialize
        while(true)
        {
            b=fibo(a);
            if(b<=n)
            {
              System.out.println(b);
              
            }
            else
             break;
             
            a++;
        }
    }//end of main()
}//end of class