import java.util.*;
class Matrix
{//start of class
    static int a[][];//instance vaiables
    static int n;//instance variables
    void row_Wise_Sum(int ar[][], int ord)
    {//function to find the row-wise sum of all the elements. 
        int s=0;//initialize
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                s=s+ar[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" : "+s);
            s=0;
        }
    }

    void right_uptriangle(int ar[][], int ord)
    {//function to display right upper triangular elements of a[ ][ ] 
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                if(i<=j)//checking
                    System.out.print(ar[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    int max_2(int ar[][], int ord)
    {//function to return the 2nd maximum element of the Matrix without sorting 
        int max=0,max2=0;//initialize
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                if(ar[i][j]>max)//checking maximum
                    max=ar[i][j];
            }
        }
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                if(ar[i][j]>max2 && ar[i][j]<max)//checking 2nd maximum
                    max2=ar[i][j];
            }
        }
        return max2;
    }

    void getData()
    {//function to accept the elements of the matrix & the order of the Matrix. 
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the order : ");
        n=sc.nextInt();//to accept and store order of the matrix
        a=new int[n][n];//initialize
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                System.out.print("Enter the Number : ");
                a[i][j]=sc.nextInt();//to accept and store the numbers of array
            }
        }
    }

    void display(int ar[][], int ord)
    {//function  to display the elements of the matrix using one loop only
        for(int i=0;i<n;i++)//outer loop
        {
            for(int j=0;j<n;j++)//inner loop
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main()
    {//start of main()
        Matrix ob=new Matrix();//object creation
        ob.getData();//calling function
        ob.display(a,n);//calling function
        ob.row_Wise_Sum(a,n);//calling function
        ob.right_uptriangle(a,n);//calling function
        int k=ob.max_2(a,n);
        System.out.println("Second maximum "+k);
    }//end of main()
}//end of class