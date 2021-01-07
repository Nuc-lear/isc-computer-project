import java.util.*;
class Perfect_Series
{//start of class
    public static void main(String args[])
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("N = ");
        int n=sc.nextInt();//to store value of N from user
        for(int i=1;i<=n;i++)
        {//start of for loop
            int s=i;//initialize
            for(int j=i+1;j<=n;j++)
            {
                s=s+j;
                if(s==n)//checking
                {
                    for(int k=i;k<=j;k++)
                        System.out.print(k+" ");    
                    System.out.println();
                    break;
                }
            }
        }//end of for loop
    }//end of main()
}//end of class