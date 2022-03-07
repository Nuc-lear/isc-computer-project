 import java.util.*;
public class Paragraph2
{
    static String a;
    static String sent[];
    static String vowel[]=new String[100];
    static int vc=0;
    public static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE PARAGRAPH");
        a=sc.nextLine();
        a=a.toUpperCase();
    }
    public static void sentences()
    {
        char p;
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            p=a.charAt(i);
            if(p=='.'||p==','||p=='!'||p=='?')
            {
                c++;
            }
        }
        sent=new String[c];
        int x=0;
        String y="";
        for(int i=0;i<a.length();)
        {
            p=a.charAt(i);
            if(p=='.'||p==','||p=='!'||p=='?')
            {
                sent[x++]=y+p;
                y="";
                i+=2;
            }
            else
            {
                y=y+p;
                i+=1;
            }
        }
    }

    public static void word(String sentence)
    {
        char p;
        int x=0;
        for(int i=0;i<sentence.length();i++)
        {
            p=sentence.charAt(i);
            if(p==' ')
                x++;
        }
        String words[]=new String[x];
        int c=0;
        String y="";
        for(int i=0;i<sentence.length();i++)
        {
            p=sentence.charAt(i);
            if(p==' ')
            {
                words[c++]=y+p;
                y="";
            }
            else
            {
                y=y+p;
            }
        }
        String tmp="";
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(words[i].compareTo(words[j])>0)
                {
                    tmp=words[i];
                    words[i]=words[j];
                    words[j]=tmp;
                }
            }
        }
        for(int i=0;i<words.length;i++)
        {
            System.out.print(words[i]);
            vowel(words[i]);
        }
        System.out.print(y+" ");
    }
    public static void sent_sentences()
    {
        for(int i=0;i<sent.length;i++)
            word(sent[i]);
    }
    public static void vowel(String words)
    {
        char p=words.charAt(0);
        int f=0;
        if(p=='A'||p=='E'||p=='I'||p=='O'||p=='U')
        {
            for(int i=0;i<vc;i++)
            {
                if(vowel[i].equals(words))
                    f=1;
            }
            if(f==0)
                vowel[vc++]=words;
        }
    }
    public static void main()
    {//start of main()
        input();
        sentences();
        System.out.print("OUTPUT :-");
        sent_sentences();
        System.out.println();
        System.out.print("VOWEL :-");
        for(int i=0;i<vc;i++)
          if(i>=1)
                System.out.print(","+vowel[i]);
            else
                System.out.print(vowel[i]);
    }//end of main()
}//end of class