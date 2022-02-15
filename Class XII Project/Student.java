import java.util.*;

public class Student {// start of class
    String name, DOB;
    int roll;

    void getData() {// to accept the data members
        Scanner in = new Scanner(System.in);
        int dd, mm, yy;// initialize
        System.out.print("Enter name of student: ");
        name = in.nextLine();// to store name of student
        System.out.println("Enter date of birth of student :- ");
        System.out.print("Day: ");
        dd = in.nextInt();// to store date of DOB
        System.out.print("Month: ");
        mm = in.nextInt();// to store month of DOB
        System.out.print("Year: ");
        yy = in.nextInt();// to store year of DOB
        DOB = dd + "/" + mm + "/" + yy;// to store the DOB
        System.out.print("Enter roll number: ");
        roll = in.nextInt();// to store roll no
    }

    void display() {// to display the data members
        System.out.println("Name of the student: " + name);
        System.out.println("Date of birth: " + DOB);
        System.out.println("Roll no: " + roll);
    }

    public static void main(String args[]) {// start of main()
        Scanner in = new Scanner(System.in);
        Marks ma = new Marks();
        ma.getData();
        System.out.println("Enter total marks obtained by the student out of 500: ");
        double t = in.nextDouble();// to accept and store marks from user
        ma.tot = t;
        ma.readData(t);
        ma.compute();
        ma.showData();
    }// end of main
}// end of class

class Marks extends Student {// start of main()
    double tot, per;// initialize
    char gd;// initialize

    void readData(double t) {// to read total marks out of 500
        tot = t;
    }

    void compute() {// to find & store % and grade
        per = (tot / 500) * 100;
        if (per < 40)
            gd = 'D';
        else if (per >= 40 && per < 60)
            gd = 'C';
        else if (per >= 60 && per < 85)
            gd = 'B';
        else if (per >= 85)
            gd = 'A';
    }

    void showData() {// to display the total marks, percentage and grade
        super.display();
        System.out.println("Total marks obtained: " + tot + "/500");
        System.out.println("Percentage of marks: " + per + "%");
        System.out.println("Grade cleared by student: " + gd);
    }
}// end of class