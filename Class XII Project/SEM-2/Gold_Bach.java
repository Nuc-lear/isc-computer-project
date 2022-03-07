import java.util.*;

public class Gold_Bach {// start of class
    public static boolean isprime(int n) {// to check if number is prime or not
        int c = 0;// initialize
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)// checking
            return true;
        else
            return false;
    }

    public static void main() {// start of main()
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int x = sc.nextInt();// to accept and store the number from user
        if (x < 9 || x > 50)
            System.out.println("INVALID INPUT, NUMBER OUT OF RANGE");
        else {
            if (x % 2 == 1)// checking
                System.out.println("INVALID INPUT, NUMBER IS ODD ");
            else {
                System.out.print("PRIME PAIRS ARE : ");
                for (int i = 1; i <= x / 2; i += 2)// loop to check prime pairs
                {
                    if (isprime(i) == true && isprime(x - i) == true)
                        System.out.print(i + "," + (x - i) + "   ");// display the prime pairs
                }
                System.out.print("\n");
            }
        }
    }// end of main()
}// end of class