import java.util.*;
class String_Op
{// start of class
    String txt;//instance variables
    void readString()
    {//function to accept the sentence
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the sentence with full stop : ");
        txt=sc.nextLine();//to store the sentence end with full stop.
    }

    char caseConvert(char ch)
    {//function to convert Upper case to Lower case & vice versa without using any String function
        int asc=(int)ch;// ASCII Value
        if(asc>=65 && asc<=90)//check for Uppercase
            asc=asc+32;
        else
            asc=asc-32;
        char r=(char)asc;
        return r;
    }

    String sort(String s)
    {//function to sort the words of the sentence alphabetically using Bubble Sort
        String r="";//initialize
        Scanner sc= new Scanner(System.in);
        StringTokenizer st= new StringTokenizer(s);
        int nw=st.countTokens();//to count number of words
        String a[]= new String[nw];//to store the
        for(int i=0;i<nw;i++)
            a[i]=st.nextToken();//extract each word

        for(int i=0;i<nw-1;i++)//outer loop
        {
            for(int j=0;j<nw-1-i;j++)//inner loop
            {
                if(a[j].compareTo(a[j+1])>0)//checking
                {
                    String t=a[j];//swapping
                    a[j]=a[j+1];//swapping
                    a[j+1]=t;//swapping
                }
            }
        }

        for(int i=0;i<nw;i++)
            r=r+a[i]+" ";
        return r;
    }

    void display()
    {//function  to display the sorted string & new String after case conversion
        System.out.println("Original sentence : "+txt);
        String ss=sort(txt);// function call
        System.out.println("Sorted Sentence : "+ss);
        System.out.println("After case Convertion : ");
        for(int i=0;i<ss.length();i++)
        {
            char ch=ss.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))// check for alphabet
                System.out.print(caseConvert(ch));
            else
                System.out.print(ch);
        }
    }

    public static void main()
    {//start of main()
        String_Op ob= new String_Op();//creating object
        ob.readString();//calling functions
        ob.display();//calling functions
        System.out.println("                                                       ");
    }//end of main()     
}//end of class
