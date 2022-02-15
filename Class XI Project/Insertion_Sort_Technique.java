import java.util.*;
class Insertion_Sort_Technique
{//start of class
    public static void main(String args[])
    {//start of main()
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];//creating array
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter a number : " );
            a[i]=sc.nextInt();//to store number in an array
        }
        for(int i=1;i<10;i++)
        {
            int t=a[i];
            int j=i-1;
            while(j>=0 && t<a[j])//checking
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;//swapping
        }
        System.out.println("After sorting : ");
        for(int i=0;i<10;i++)
         System.out.print(a[i]+" ");
    }//end of main()
}//end of class