import java.util.*;
class Complex
{
    int x,y;
    Complex()
    {
        x=0;
        y=0;
    }
    Complex(int xx, int yy)
    {
        x=xx;
        y=yy;
    }

    Complex Add(Complex obj)
    {
        Complex R= new Complex();
        R.x=this.x+obj.x;
        R.y=this.y+obj.y;
        return R;
    }

    void display()
    {
        if(y>=0)
            System.out.println(x+" + i"+y);
        else
            System.out.println(x+" -i"+Math.abs(y));
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the real and imaginary part : ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.print("Enter the real and imaginary part : ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        Complex C1= new Complex(x1,y1);
        Complex C2= new Complex(x2,y2);
        Complex C3= new Complex();
        C3=C1.Add(C2);
        System.out.println("First Complex Number : ");
        C1.display();
        System.out.println("Second Complex Number : ");
        C2.display();
        System.out.println("Final Complex Number : ");
        C3.display();
    }
}
