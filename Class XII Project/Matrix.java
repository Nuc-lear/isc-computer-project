import java.util.*;

class Matrix {// start of class
    static Scanner sc = new Scanner(System.in);
    int arr[][] = new int[25][25];// initializing array
    int m, n;// initializing rows and coloumns

    Matrix(int mm, int nn) {// parameterized constructor to initialize the size of the matrix m=mm and n=nn
        m = mm;// initializing
        n = nn;// initializing
    }

    void fillArray() {// to enter the elements of the matrix
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    Matrix Add(Matrix A) {// to add the current object from the matrix of parameterized object and return
                          // the resulting object.
        Matrix B = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)

                B.arr[i][j] = arr[i][j] + A.arr[i][j];
        }
        return B;

    }

    void display() {// to display the matrix elements
        System.out.print("FINAL MATRIX:");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        System.out.print("\n");
    }

    public static void main(String args[]) {// start of main()
        System.out.print("Size of array:");
        System.out.print("\nEnter the number of rows: ");
        int x = sc.nextInt();// to accept and store the number of rows
        System.out.print("Enter the number of columns: ");
        int y = sc.nextInt();// to accept and store the number of columns
        Matrix A = new Matrix(x, y);
        Matrix B = new Matrix(x, y);
        Matrix C = new Matrix(x, y);
        A.fillArray();
        B.fillArray();
        C = A.Add(B);
        C.display();
    }// end of main()
}// end of class