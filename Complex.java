import java.util.*;
class Complex
{//start of class
    int x,y;//initialize
    Complex() 
    { 
        x=0;
        y=0;
    }

    Complex(int xx, int yy)
    { //parameterized constructor to assign value to data members
        x=xx;
        y=yy;
    }

    Complex Add(Complex obj)
    { //calculates and returns the sum of the two complex numbers 
        Complex R= new Complex();
        R.x=this.x+obj.x;
        R.y=this.y+obj.y;
        return R;
    }

    void display()
    { //to display the Complex Number
        if(y>=0)
            System.out.println(x+" + i"+y);
        else
            System.out.println(x+" -i"+Math.abs(y));
    }

    public static void main()
    {//start of main()
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the real and imaginary part : ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.print("Enter the real and imaginary part : ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        Complex C1= new Complex(x1,y1);//creating object
        Complex C2= new Complex(x2,y2);//creating object
        Complex C3= new Complex();//creating object
        C3=C1.Add(C2);
        System.out.println("First Complex Number : ");
        C1.display();//function call
        System.out.println("Second Complex Number : ");
        C2.display();//function call
        System.out.println("Final Complex Number : ");
        C3.display();//function call
    }//end of main()
}//end of class