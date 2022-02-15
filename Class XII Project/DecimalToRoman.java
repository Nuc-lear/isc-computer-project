import java.util.*;

class DecimalToRoman {// start of class
    static String toRoman(int num)// function to calculate roman equivalent
    {
        // storing roman values of digits from 0-9 when placed at different places
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        // converting to roman number
        String thousands = m[num / 1000];
        String hundereds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];

        // calculating and storing the final result
        String result = thousands + hundereds + tens + ones;
        return result;
    }

    public static void main(String args[]) {// start of main()
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int n = sc.nextInt();// to accept and store the number from user
        System.out.println("ROMAN NUMBER EQUIVALENT: " + toRoman(n));
    }// end of main()
}// end of class