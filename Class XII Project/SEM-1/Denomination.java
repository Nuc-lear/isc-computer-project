/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class Denomination
{//start of class
    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int n=sc.nextInt();//to accept the amount from the user
        if(n>=1 && n<=99999)//checking amount
        {
            String words[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};//initialize
            int note[]={2000,500,200,100,50,20,10,5,2,1};//initialize
            String r="";//initialize
            int cpy=n,i=0,c=0;//initialize
            while(n>0)//123
            {
                int d=n%10; // digit extraction
                r=words[d]+" "+r;   
                n=n/10; // modification
            }
            System.out.println(r);
            n=cpy; //copy the number
            System.out.println("DENOMINATION: ");
            while(n>0)
            {
                int m=n/note[i]; //store number of notes
                if(m!=0)//checking
                {
                    System.out.println(note[i]+" * "+m+" = "+(m*note[i]));
                    c+=m; //count total number of notes
                    n=n%note[i];
                }
                i++;
            }
            System.out.println("TOTAL ="+cpy);
            System.out.println("TOTAL NUMBER OF NOTES ="+c);
        }// end of if
        else
            System.out.println("INVALID AMOUNT ");
    }//end of main()
}//end of class