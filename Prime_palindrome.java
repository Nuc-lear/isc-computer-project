import java.util.*;
import java.io.*;
class  Prime_palindrome
{//start of class
    public static boolean prime(int n)
    {//function to check number is prime or not
        int c=0;//store number of factors
        for(int i=1;i<=n;i++)//loop
        {
            if(n%i==0)
                c++;
        }
        if(c==2)//checking
            return true;
        else
            return false;
    }

    public static boolean palindrome(int n)
    {//function to check number is palindrome or not
        int r=0;//store reverse
        int cpy=n;// copy the number
        while(n>0)//checking
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(cpy==r)//checking
            return true;
        else
            return false;
    }

    public static void main()throws IOException
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();

        FileWriter fw= new FileWriter("Number.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);

        for(int i=1;i<=n;i++)//start of for loop
        {
            System.out.print("Enter Number : ");
            int num=sc.nextInt();
            pw.println(num);
        }//end of for loop
        pw.close();

        FileReader fr= new FileReader("Number.txt");
        BufferedReader br=new BufferedReader(fr);

        String pr="" , pal="";
        for(int i=1;i<=n;i++)
        {//start of for loop
            int num=Integer.parseInt(br.readLine());
            if(prime(num)==true)
                pr=pr+num+" ";
            if(palindrome(num)==true)
                pal=pal+num+" ";
        }//end of for loop
        br.close();
        System.out.println("Prime Numbers : "+pr);
        System.out.println("Palindrome Numbers : "+pal);

    }//end of main()
}//end of class