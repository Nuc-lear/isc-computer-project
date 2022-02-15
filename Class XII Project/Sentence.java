import java.util.*;

class Sentence {// start of class
    public static void main(String args[]) {// start of main()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence  : ");
        String s = sc.nextLine();// to accept and store the sentence from user
        int l = s.length();// to store length of the sentence
        s = s.toUpperCase();// converting the sentence to uppercase
        String ns = "";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ')
                ns += ch;
            else
                continue;
        }
        System.out.println("New Sentence : " + ns);
        StringTokenizer st = new StringTokenizer(ns);
        int nw = st.countTokens();// number of words
        String a[] = new String[nw];
        for (int i = 0; i < nw; i++)
            a[i] = st.nextToken();// extract each word
        int m = 0;
        for (int i = 0; i < nw; i++) {
            if (a[i].length() > m)
                m = a[i].length();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nw; j++) {
                if (i < a[j].length())
                    System.out.print(a[j].charAt(i) + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        int f = 0;
        String c = "";
        for (int i = 0; i < nw - 1; i++) {// to find consecutive words end with same character
            char ch1 = a[i].charAt(a[i].length() - 1);
            char ch2 = a[i + 1].charAt(a[i + 1].length() - 1);
            if (ch1 == ch2)// checking characters
            {
                c = c + a[i] + " " + a[i + 1];
                f++;
            }
        }
        if (f == 0)
            System.out.println("Consecutive words end with same character: None");
        else {
            System.out.println("Consecutive words end with same character: " + c);
            System.out.println("Total: " + (f + 1));
        }
    }// end of main()
}// end of class