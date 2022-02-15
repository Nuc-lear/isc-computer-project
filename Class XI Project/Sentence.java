import java.util.*;
class Sentence
{//start of class   
    public static void main (String[] args)   
    {//start of main()   
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s=sc.nextLine();//to accept a sentence from user
        int l=s.length();//length of the sentence 
        char lc=s.charAt(l-1);//extract last character
        if(lc=='.')//checking
        {
            s=s.substring(0,l-1);// remove last character
            s=s+" ";
            String min=s,w="";//initialize
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);//extract each character
                if(ch!=' ')
                    w=w+ch;//  store each word
                else
                {
                    if(w.length()<min.length())//checking
                        min=w;
                    w=""; 
                }
            }
            String r="",rw="";// initialize
            System.out.print("Smallest Word : ");
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);//extract each character
                if(ch!=' ')//checking
                {
                    w=w+ch;// store each word
                    rw=ch+rw; //store reverse of each word
                }
                else
                {
                    r=r+rw+" ";
                    if(w.length()==min.length())
                        System.out.print(w+" ");
                    w="";
                    rw="";
                }
            }
            r=r.trim();
            r=r+lc; // add last character at the end
            System.out.println("\nAfter reverse each word at its position : "+r);
        }

        else
            System.out.println("INVALID SENTENCE ");
    }//end of main()
}//end of class      