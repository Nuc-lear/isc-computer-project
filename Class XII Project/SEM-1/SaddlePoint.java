 /*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
public class SaddlePoint
{//start of class
    public static void main(String args[])
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.print(" N = ");
        int n=sc.nextInt();//to accept and store value of N from user
        if(n<20)//checking
        {
            int a[][]=new int[n][n];//initialize
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("Enter Number : ");
                    a[i][j]=sc.nextInt();//to accept elements from user
                }
            }
            System.out.println("Original Matrix ");//to print original matrix
            for(int i=0;i<n;i++)//outer loop
            {
                for(int j=0;j<n;j++)//inner loop
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            int min,max,f=0;//initialize
            for(int i=0;i<n;i++)
            {
                min=a[i][0];//initialize min value
                int p=0;//initialize
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]<min)//checking
                    {
                        min=a[i][j];//to check and store the minimum value
                        p=j;//to store the position of minimum value
                    }
                }
                max=a[0][p];//initialize max value
                for(int j=0;j<n;j++)
                {
                    if(a[j][p]>max)//checking
                        max=a[j][p];//to check and store the maximum value
                }
                if(max==min)//checking
                {
                    System.out.println("SADDLE POINT = "+max+" ("+i+", " +p+")");
                    f=1;
                    break;
                }
            }
            if(f==0)//checking
                System.out.println("NO SADDLE POINT ");
        }
        else
            System.out.println("INVALID ORDER ");
    }//end of main()
}//start of class