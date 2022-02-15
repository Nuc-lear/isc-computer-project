import java.util.*;

class Worker {// start of class
    String Name;// initialize
    double Basic;// initialize

    public Worker(String n, double b) {// parameterized constructor
        Name = n;// to store the name of the worker
        Basic = b;// to store the basic pay in decimal
    }

    public void display() {// to display worker details
        System.out.println("NAME: " + Name);
        System.out.println("BASIC PAY: " + Basic);
    }

    public static void main(String args[]) {// start of main()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Worker Name: ");
        String na = sc.nextLine();// to store worker name
        System.out.print("Enter Worker's Basic Pay: ");
        double bp = sc.nextDouble();// to store worker basic pay
        System.out.print("Enter Hours Worked: ");
        double hs = sc.nextDouble();// to store hours worked
        System.out.print("Enter Rate Per Hour: ");
        double rte = sc.nextDouble();// to store rate per hour
        Wages wg = new Wages(na, bp, hs, rte);
        wg.display();
    }// end of main()
}// end of class

class Wages extends Worker {// start of class
    double hrs, rate, wage; // initialize

    public Wages(String n, double b, double h, double r) {// parameterized constructor
        super(n, b);
        hrs = h;// stores the hours worked
        rate = r;// stores rate per hour
    }

    public double overtime() {// to calculate and return the overtime amount
        return (hrs * rate);
    }

    public void display() {// to display all the details
        System.out.println("\nWORKER DETAILS");
        super.display();
        wage = overtime() + Basic;// to calculate and store the overall wage of the worker
        System.out.println("WAGE: " + wage);
    }
}// end of class