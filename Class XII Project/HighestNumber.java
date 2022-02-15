import java.util.*;

class HighestNumber {// start of class
    void sort(int n, int q[], int le) {// to sort the number
        for (int i = 0; i < le; i++) {
            for (int j = 0; j < le; j++) {
                if (q[i] > q[j]) {
                    n = q[i];// swaping
                    q[i] = q[j];// swaping
                    q[j] = n;// swaping
                }
            }
        }
    }

    void display(int le, int q[]) {// to display the number and its highest form
        System.out.print("Highest form: ");
        for (int i = 0; i < le; i++) {
            System.out.print(q[i]);
        }
    }

    void words(int q[], int le) {// to store and display the word form of numbers
        for (int i = 0; i < le; i++) {
            if (q[i] == 0)
                System.out.print("ZERO ");
            if (q[i] == 1)
                System.out.print("ONE ");
            if (q[i] == 2)
                System.out.print("TWO ");
            if (q[i] == 3)
                System.out.print("THREE ");
            if (q[i] == 4)
                System.out.print("FOUR ");
            if (q[i] == 5)
                System.out.print("FIVE ");
            if (q[i] == 6)
                System.out.print("SIX ");
            if (q[i] == 7)
                System.out.print("SEVEN ");
            if (q[i] == 8)
                System.out.print("EIGHT ");
            if (q[i] == 9)
                System.out.print("NINE ");
        }
    }

    public static void main(String args[]) {// satrt of main()
        Scanner in = new Scanner(System.in);
        HighestNumber hn = new HighestNumber();
        int num, d, n, l, le, na;// initialize
        System.out.print("Enter a number within 1000: ");
        if ((num = in.nextInt()) <= 1000)// checking
        {
            n = num;
            if (num < 0)// checking
            {
                n = num;
                System.out.println("Negative number");
                System.out.print("Absolute value " + (num = Math.abs(num)));
            }
            l = (num + "").length();// store value
            le = l;
            int[] arr = new int[l];// initialize
            while (num != 0) {
                d = num % 10;
                num = num / 10;
                arr[--l] = d;
            }
            if (n > 0)// checking
            {
                System.out.print("You have entered ");
                hn.words(arr, le);
                hn.sort(n, arr, le);// sorting
                System.out.println("");
                hn.display(le, arr);// displaying the needed output
            }
            System.out.print(" in word form: ");
            hn.words(arr, le);
        } else
            System.out.println("OUT OF RANGE!!");
        System.out.print("\n");
    }// end of main()
}// end of class