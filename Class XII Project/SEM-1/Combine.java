/*
 * Name: ARGHYA GHOSH
 * Class: XII
 * Section: Science - A
 * Roll No: 16
 * UID: 7083810
 * Session: 2021-2022
 */
import java. util.*;
class Combine
{//start of class
    int com [], size;
    public Combine(int nn)//parameterized constructor to assign size = nn
    {
        size = nn;//initialize
        com = new int [size];//initialize
    }

    void input_array()//to accept and store the number in an array from an user
    {
        Scanner sc=new Scanner(System.in);
        int i;//initialize
        for(i = 0; i < size; i++)
        {
            System.out.print ("Enter a no.");
            com [i] = sc.nextInt();//to accept the number from user
        }
    }

    void sort()
    // sorts the elements of combined array in ascending order using the Selection Sort technique.
    {
        int i, j, t;
        for(i = 0; i < size; i++)
        {
            for(j = i + 1; j < size; j++) 
            { 
                if(com[i] > com [j])
                {
                    t = com [i];//swapping
                    com [i] = com [j];//swapping
                    com [j] = t;//swapping
                }
            }
        }
    }

    void mix(Combine A, Combine B)
    //combines the parameterized object arrays and stores the result in the current object array along with the duplicate elements,
    {
        int i, j;
        for (i = 0, j = 0; i < A.size; i ++, j++)
        {
            com[j] = A.com[i];
        }
        for (i = 0; i < B.size; i++, j++)
        {
            com [j] = B.com [i];
        }
    }

    void display()//displays the array elements
    {
        int i;
        for (i = 0; i < size; i ++)
        {
            System.out.println(com[i]);
        }
    }

    public static void main(String args [ ]) 
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements for first array : ");
        int m=sc.nextInt();//to store elements in first array
        System.out.print("Enter no. of elements for second array : ");
        int n=sc.nextInt();//to store elements in second array
        Combine c1 = new Combine(m);
        Combine c2 = new Combine(n);
        Combine c3 = new Combine(m+n);
        System.out.println("Elements for first array : ");
        c1.input_array();//method call
        System.out.println("Elements for second array : ");
        c2.input_array();
        c3.mix (c1, c2);//method call
        c3.sort();//method call
        System.out.println("Merge Eleemnts ");
        c3.display();//method call
    }//end of main()
}//end of class