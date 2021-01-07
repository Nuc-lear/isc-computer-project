class Kaprekar_Number 
{   
    static boolean kaprekar(int n)   
    {   
        if (n == 1)   
            return true;   
        int sq_n = n * n;
        int copy=sq_n;
        int d= 0;   
        while (copy != 0)   
        {   
            d++;   
            copy /= 10;   
        }     
        for (int r_digits=1; r_digits<d; r_digits++)   
        {   
            int eq_parts = (int) Math.pow(10, r_digits);   
            if (eq_parts == n)   
                continue;   
            int sum = sq_n/eq_parts + sq_n % eq_parts;   
            if (sum == n)   
                return true;   
        }   
        return false;   
    }       
    static int s=0;
    public static void main (String[] args)   
    {   
        System.out.print("The Karpekar Numbers from 1 to 1000 are : ");
        for (int i=1; i<1000; i++)   
            if (kaprekar(i))   {
                System.out.print(i + " ");  
                s=s+i;
            }
        System.out.println("                                             ");
        System.out.println("Sum of all Karpekar Numbers from 1 to 1000 : "+s);
    }
}      