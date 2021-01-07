import java.util.*;
class Transpose_Mirror_Matrix
{// start of class
    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n=sc.nextInt();//to accept and store order from user
        int a[][]= new int[n][n];//initialize
        int b[][]= new int[n][n];//initialize
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                System.out.print("Enter No. ");
                a[i][j]=sc.nextInt();//to accept and store numbers in an array
            }
        }
        System.out.println("Original Matrix");
        //to display the original matrix
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix");
        //to convert the original matrix to transpose matrix
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Mirror Matrix");
        //to display the mirror matrix
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

    }//end of main()
}//end of class