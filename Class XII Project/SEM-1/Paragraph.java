 /*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
*/
import java.util.*;
class Paragraph
{//start of class
    public static String sort(String s)//sort each sentence in alphabetical order
    {
        int l=s.length();//to calculate the length of the sentence
        char lc=s.charAt(l-1); // store the last character 
        s=s.substring(0,l-1)+" "; // remove last character
        StringTokenizer st=new StringTokenizer(s);
        int wc=st.countTokens(); //number of words
        String t[]=new String[wc];
        for(int i=0;i<wc;i++)
            t[i]=st.nextToken();// extract each word
        for(int i=0;i<wc-1;i++)// no. of pass
        {
            for(int j=0;j<wc-1-i;j++)// no. of compare
            {
                if(t[j].compareTo(t[j+1])>0)
                {
                    String x=t[j];//swapping
                    t[j]=t[j+1];//swapping
                    t[j+1]=x;//swapping
                }
            }
        } 
        String r=""; // initialize
        for(int i=0;i<wc;i++)
            r=r+t[i]+" ";
        r=r+lc;//store the result
        return r;
    }

    public static void main()
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph : ");
        String a=sc.nextLine();
        a=a.toUpperCase(); // convert into uppercase
        String k[]=new String[50];
        String sen=""; //initialize
        int index=0; //initialize
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i); //extract each character
            if(ch!=',' && ch!='.' && ch!='?' && ch!='!')
                sen+=ch; // extract each sentence
            else
            {
                k[index++]=sen.trim()+ch; // store th result in array
                sen="";
            }
        }
        for(int i=0;i<index;i++)
        {
            String r=sort(k[i]); // call method
            System.out.print(r+" ");
        }
        System.out.println();
        System.out.print("VOWELS : ");
        for(int i=0;i<index;i++)
        {
            String tt=k[i];
            StringTokenizer st=new StringTokenizer(tt);
            int wc=st.countTokens();//number of words
            String t[]=new String[wc];
            for(int j=0;j<wc;j++)
            {
                t[j]=st.nextToken();
                char fc=t[j].charAt(0);//extract first character
                if(fc=='A' || fc=='E' || fc=='I' || fc=='O' || fc=='U')

                    System.out.print(t[j]+" ");
            }
        }
        System.out.println();
    }//end of main()
}//end of class