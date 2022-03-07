 /*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/ 
import java.util.*;
class Date
{//start of class
    public static boolean leap(int y)//to check leap year
    {
        if(y%400==0 || y%4==0 && y%100!=0)
            return true;
        else
            return false;
    }

    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        String week[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};//initialize
        int nod[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter the Date : (DD MM YYYY) : ");
        String day=sc.nextLine();//to accept day from user
        int d=Integer.parseInt(day.substring(0,2));//extract day
        int m=Integer.parseInt(day.substring(3,5));//extract month
        int y=Integer.parseInt(day.substring(6));//extract year
        if(leap(y)==true)//checking
            nod[2]=29;
        if(m>=1 && m<=12 && d>=1 && d<=nod[m])//checking
        {
            int k=d;
            for(int i=1;i<m;i++)
                k+=nod[i];
            System.out.print("The day value is : "+k+" days and day is : ");
            for(int i=1;i<y;i++)
            {
                if(leap(i)==true)
                    k+=366;
                else
                    k+=365;
            }
            System.out.println(week[k%7]);
        }
        else
         System.out.println("Invalid Date...");
    }//end of main()
}//end of class