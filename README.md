# Class XI Project
<p align="right">                              
<img src="https://logos-download.com/wp-content/uploads/2016/10/Java_logo_icon.png" height=50>
</p>

**Languages Used:**

![](https://img.shields.io/badge/Java-informational?style=flat-square&logo=java&logoColor=white&color=2bbc8a)

# Questions

## Program 1</br>

### WAP in Java to generate a decimal number from 100 to 200 and convert it equivalent binary, octal (without using String & array) & hexadecimal form (without using array). Test your program for the following data & some random data. (Use minimum complexity to convert the base value & don’t use any inbuilt methods)</br>

#### **Sample Input**:
Enter the number: **123**

#### Sample Output:
Equivalent Binary form: **1111011**</br> 
Equivalent Octal form: **173**</br>
Equivalent Hexadecimal form: **7B**</br>

## Program 2

### WAP in Java to display all the composite Fibonacci numbers between 1 to ‘n’. Composite Fibonacci No = 8, 21, 55 [The no. that is a Composite & also Fibonacci]

**Class: Comp\_Fibo**</br>

#### Instance Variable: 
**int n** : to store the upper limit</br> 
Rest of the member variables can be assumed as required.</br> 
#### Instance Method:</br>

**Comp\_Fibo ( )** : to initialize the variables.</br> 
**void display ( int num)** : to display the Composite Fibonacci number.</br> 
**boolean chk\_Composite ( int n )** : to check the ‘n’ is Prime or not, using best method & if it is Prime return false otherwise return true.</br> 
**int chk\_Fibo ( int n )** : to check the ‘n’ is Fibonacci or not (without using 3rd variable) if true return 1 otherwise return 0.</br> 
Write a **main ( )** to test your class & call the methods using the object.

## Program 3 
 
### A positive natural number, ( for e.g. 27 ) can be represented as follows: 2+3+4+5+6+7 8 + 9 + 10 13 + 14 Here every row represents a combination of consecutive natural numbers, which add up to 27.Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, which when added give N. Test your program for the following data & some random data. 

Sample Input: N = 9

Sample Output: 2 3 4 45

Sample Input: N = 15 

Sample Output: 1 2 3 4 5 456 78

## Program 4

### Develop an object oriented program in Java to do the following task:

**Class Name: Matrix**

#### Member variables:

**int a [n] [n]** : to store the elements of the matrix of (n x n) order. 
Rest of the member variables can be assumed as required.

#### Public Member functions:

**void row\_Wise\_Sum (int , int)** : to ﬁnd the row-wise sum of all the elements.</br>
**void right\_uptriangle(int , int)** : to display right upper triangular elements of a[ ][ ]</br> 
**int max\_2(int , int)** : to return the 2nd maximum element of the Matrix without sorting.</br>
**void getData ( )** : to accept the elements of the matrix & the order of the Matrix.</br>
**void display (int , int )** : to display the elements of the matrix using one loop only.</br>
**int calculate(int n)** : to pass the matrix a[ ][ ] & the order of the matrix i.e. n.</br>
Test your class using the **main ( )** method.</br>

## Program 5

### WAP in Java to compute the following series using the concept of function overloading:</br>
**S=1-(x2/2!)+(x4/4!)-(x6/6!)+ ---------- +(xn/n!)**

**Class Name: Series**

#### Class variables:

**int n** : to accept a number of terms to be added.</br>  
**int x** : to accept the value of x.</br>  
*Rest of the member variables can be assumed as required.

#### Public Member functions:

**void input ( ) :** to accept the number of terms & value of x using Scanner class.</br>
**void sum\_of\_series( ) :** to calculate the sum of the series.</br>
**void display (double) :** to display the sum of the series.</br>
**double calculate (int , int) :** to calculate the power of x without iteration.</br>
**int calculate (int n) :** to calculate the factorial of the denominator.</br>
Declare the **main ( )** in another class named as **Sum\_Series** and inside the **main ( )** call the methods. You are not supposed to use any **in-built** Math functions.</br>

## Program 6

### A class **String\_Op** is designed to sort the words of a sentence alphabetically. 

#### Data member:

**String txt** : to store the sentence end with full stop.</br>
Rest of the member variables can be assumed as required.

#### Member function:

**void readString ( ) :** to accept the sentence char</br>
**caseConvert (char)** :** to convert Upper case to Lower case & vice versa without using any String function.</br>
**String sort ( String )** :** to sort the words of the sentence alphabetically using Bubble Sort</br>
**void display(String )** : to display the sorted string & new String after case conversion.</br>
Write a **main ( )** to call the methods using the object.</br>

## Program 7 
### An integer array a [ ] consists of N diﬀerent elements in unsorted order. We want to rearrange them according to the given instruction: Find the maximum value of the array and put it in the center position. Find the next largest value and put it to its right. Then ﬁnd the next largest and place it to its left and so on alternating right and left until all integers in the array replaced. Assume that there are at most 20 diﬀerent elements in the array (There are no duplicate elements in the array). For e.g. if the element of the array initially: 7, 3, 1, 6, 4, 2, -1 and 5 then after rearranging it becomes 1, 3, 5, 7, 6, 4, 2 and -1. Write a program to accept N diﬀerent element in an array & rearrange them according to the given instruction.

#### **Sample Input:**

Enter the Limit of the array: 5 
Enter the Number: 7 
Enter the Number: 9
Enter the Number: 2
Enter the Number: 5
Enter the Number: 6

#### **Sample Output:**

**Original array:**

7 9 2 5 6
**Rearrange Array:**

2 6 9 7 5

## Program 8

### Write a program in Java to accept the elements in a square matrix of order n x n then transpose the elements of the matrix & ﬁnally display the mirror image of that transpose form along with the original form.

#### Sample Input:

Enter the order of the matrix (n) = 3

**The Matrix is:** 

1 2 3</br>
4 8 9</br>
7 6 5</br>

**Transpose form:**

1 4 7</br>
2 8 6</br>
3 9 5</br>

**Mirror Image:**

7 4 1</br>
6 8 2</br>
5 9 3</br>

**Output should be taken using both odd ordered and even ordered matrices.**

<p align="center">
  Made with :heart: and Java</br>
</p>
by uiuxarghya
