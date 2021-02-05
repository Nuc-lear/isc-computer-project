class Kaprekar_Number
{//start  of class   
    static boolean kaprekar(int n)   
    {   
        int cpy=n;// copy the number
        int p=1;// initialize
        while(cpy>0)
        {
            p=p*10;
            cpy=cpy/10;
        }
        int s=n*n;// square of the number
        int f=s/p;// first part
        int l=s%p;// last part
        if(f+l==n)
            return true;
        else
            return false;

    }   

    public static void main (String[] args)   
    {//start of main()   
        System.out.print("The Karpekar Numbers from 1 to 1000 are : ");
        int s=0;// initilaize
        for (int i=1; i<1000; i++)   
            if (kaprekar(i))   
            {
                System.out.print(i + " ");  
                s=s+i;
            }

        System.out.println("\nSum of all Karpekar Numbers from 1 to 1000 : "+s);
    }//end of main()
}//end of class      