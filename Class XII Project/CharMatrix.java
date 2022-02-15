import java.util.*;

class CharMatrix {// start of class
    public static void main(String args[]) {// start of main()
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();// to accept and store the size of the matrix
        if (n < 1 || n > 10)// checking size of matrix
        {
            System.out.println("SIZE OUT OF RANGE!!");
            return;
        }
        System.out.print("FIRST CHARACTER : ");
        char ch1 = sc.next().charAt(0);
        System.out.print("SECOND CHARACTER : ");
        char ch2 = sc.next().charAt(0);
        System.out.print("THIRD CHARACTER : ");
        char ch3 = sc.next().charAt(0);
        char m[][] = new char[n][n];
        char x = ch2;// storing a copy of 2nd character
        // filling the matrix with the characters according to the given rules
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1)
                    m[i][j] = ch3;
                else if (i == 0 || i == n - 1)
                    m[i][j] = ch1;
                else if (j == 0 || j == n - 1 || i % 2 == 0)
                    m[i][j] = ch2;
                else
                    m[i][j] = ch1;
            }
        }
        // display the final matrix
        System.out.println("OUTPUT :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }// end of main()
}// end of class