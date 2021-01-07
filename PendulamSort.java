import java.util.*;
class PendulamSort
{//start of class
    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the order : ");
        int n=sc.nextInt();//to input the order of matrix from user
        if(n>1 && n<=20)
        {
            int a[]= new int[n];//initializing array
            int b[]= new int[n];//initializing array
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter No. ");
                a[i]=sc.nextInt();//to store the number in array
            }
            System.out.println("Original array : ");
            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            //sorting
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(a[j]<a[j+1])//chacking
                    {
                        int t=a[j];//swapping
                        a[j]=a[j+1];//swapping
                        a[j+1]=t;//swapping
                    }
                }
            }
            int m=n/2;//to store the middle index
            b[m]=a[0]; 
            int l=m-1;
            int r=m+1;
            for(int i=1;i<n;)
            {
                b[r++]=a[i++];
                b[l--]=a[i++];
            }

            System.out.println();
            System.out.println("Rearrange array : ");
            for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
            System.out.println("                                                  ");
        }
        else
            System.out.println("Invalid Range");
    }//end of main()
}//end of class