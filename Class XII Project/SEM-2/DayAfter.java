import java.io.*;

class DayAfter {// start of class
    public static void main(String args[]) throws IOException {// start of main()
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n, day, year, i, p, k = 0;// initialize
        int ar[] = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };// initialize array
        // initialize array of months
        String br[] = { "", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };
        System.out.print("DAY NUMBER: ");
        day = Integer.parseInt(in.readLine());// to accept and store number of day
        System.out.print("YEAR: ");
        year = Integer.parseInt(in.readLine());// to accept and store year
        System.out.print("DATE AFTER (N): ");
        n = Integer.parseInt(in.readLine());// to accept and store day after N
        p = day + n;// final day
        int a = 1, b = 1, date = 0, nday = 0, year1 = year;// initialize
        if (year % 4 == 0)// checking leap year
        {
            for (i = 2; i <= 12; i++) {
                ar[i] += 1;
            }
            if (day >= 1 && day <= 366)// checking days
            {
                for (i = 0; i <= 12; i++) {
                    if (ar[i] < day)
                        a = i;
                    if (ar[i] > day)
                        break;
                }
                date = day - ar[a];// finding and storing date
            } else
                k = 1;
            if (k == 1)
                System.out.println("DAYS ARE OUT OF RANGE!");
            else if (k != 1 && n >= 1 && n <= 100)// checking value of N
            {
                if (p > ar[12]) {
                    p = p - ar[12];
                    year1 = year1 + 1;
                }
                for (i = 0; i <= 12; i++) {
                    if (ar[i] < p)
                        b = i;
                    if (ar[i] > p)
                        break;
                }
                nday = p - ar[b];// finding and storing new day
            } else {
                k = 1;
                System.out.println("N DAYS ARE OUT OF RANGE!");
            }
            if (k != 1)// checking
            {
                System.out.println("DATE IS: " + date + "th " + br[a + 1] + " " + year);// displaying date
                System.out.println("DATE AFTER " + n + " DAYS: " + nday + "th " + br[b + 1] + " " + year1);// displaying
                                                                                                           // date after
                                                                                                           // N
            }
        } else {
            if (day >= 1 && day <= 365)// checking days
            {
                for (i = 0; i <= 12; i++) {
                    if (ar[i] < day)
                        a = i;
                    if (ar[i] > day)
                        break;
                }
                date = day - ar[a];// finding and storing date
            } else
                k = 1;
            if (k == 1)
                System.out.println("DAYS ARE OUT OF RANGE!");
            if (n >= 1 && n <= 100)// checking the value of N
            {
                if (p > ar[12]) {
                    p = p - ar[12];
                    year1 = year1 + 1;
                }
                for (i = 0; i <= 12; i++) {
                    if (ar[i] < p)
                        b = i;
                    if (ar[i] > p)
                        break;
                }
                nday = p - ar[b];// finding and storing date after N
            } else {
                k = 1;
                System.out.println("N DAYS ARE OUT OF RANGE!");
            }
            if (k != 1) {
                System.out.println("DATE IS: " + date + "th " + br[a + 1] + " " + year);// displaying date
                System.out.println("DATE AFTER " + n + " DAYS: " + nday + "th " + br[b + 1] + " " + year1);// displaying
                                                                                                           // date after
                                                                                                           // N
            }
        }
    }// end of main()
}// end of class