// week 1 - prog 1
// import java.util.*;
// public class n1{
//     public static void main(String[]args){
//         try (Scanner sc = new Scanner(System.in)) {
//             int n=sc.nextInt();
//             if(n>0){
//                 System.out.println("Positive");
//             }
//             else if(n<0){
//                 System.out.println("Negative");
//             }
//             else{
//                 System.out.println("Zero");
//             }
//         }
//     }
// }

// Week 1 - prog 2
// import java.util.Scanner;
// public class n1{
//     public static void main(String[]args){
//         try (Scanner in = new Scanner(System.in)) {
//             double r=in.nextDouble();
//             double h=in.nextDouble();
//             double v=Math.PI*r*r*h;
//             System.out.printf("Volume is: %.2f",v);
//         }
//     }
// }

// week 1 - prog 3
// import java.util.*;
// public class n1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1; i<=n; i++){
//             System.out.println(n+"x"+i+"="+n*i);
//         }
//         sc.close();
//     }
// }

// week 1 - prog 4
// import java.util.Scanner;
// public class n1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int q=0,r=0;
//         if(y==0){
//             System.out.println("Error");
//         }
//         else{
//             q=x/y;
//             r=x%y;
//         }
//         System.out.println("Quotient is: "+q);
//         System.out.println("Remainder is: "+r);
//         sc.close();
//     }
// }

// week 1 - prog 5 & week 2 - prog 1, prog 2
// import java.util.*;
// public class n1{
//     public static void main(String[]args){
//         try (Scanner sc = new Scanner(System.in)) {
//             double l=sc.nextDouble();
//             double b=sc.nextDouble();
//             double p=2*(l+b);
//             double a=l*b;
//             System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n",l,b,p);
//             System.out.printf("Area is %.1f * %.1f = %.2f",l,b,a);
//         }
//     }
// }
//  note: while using format parameters for printing, use printf not println

// week 2 - prog 3
// import java.util.*;
// public class n1{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n]; // this is how u declare and initialise an array
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int m=arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i]>m){
//                 m=arr[i];
//             }
//         }
//         System.out.println("Maximum is: "+m);
//     }
// }

// week 2 - prog 4 (used a static class)
// import java.util.*;
// public class n1{
//     static class rectangle{
//         int l;
//         int w;
//     }
//     public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        rectangle rect=new rectangle(); // this is how u call a class
//        rect.l=a;// this is how static class members are accessed
//        rect.w=b;
//        int s=rect.l+rect.w;
//        System.out.println("Sum of length and width is: "+s);
//        sc.close();// '+' is used to print the integers, ',' is used for characters
//     }
// }

// week 2 - prog 5
// import java.util.*;
// public class n1{
//     static class circle{
//         int r;
//         circle(int r){//use of a constructor
//             this.r=r;
//         }//constructor shud be same as the name of the class
//     }
//     public static void main(String[]args){
//          Scanner sc=new Scanner(System.in);
//          int ra=sc.nextInt();
//          circle c= new circle(ra);
//          System.out.println("The radius of the circle is:"+c.r);
//          sc.close();
// TODO: Write a constructor that takes radius as parameter
        // Use the 'this' keyword to assign the value to the member variable

        /*
         Hint:
         The constructor name should be Circle
         Use: this.radius = radius;
         */
//     }
// }

// Week 3 - prog 1
// import java.util.*;
// public class n1{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             for(int i=n; i>=1; i--){
//                 for(int j=0; j<i; j++){
//                         System.out.print("*");
//                 }
//                 System.out.println();
//             }
//             for(int i=2; i<=n; i++){
//                 for(int j=0; j<i; j++){
//                         System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
// }

// week 3 - prog 2
// import java.util.Scanner;
// public class n1{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             for(int i=1; i<=n; i++){
//                 if(n%i==0){
//                         System.out.print(i+" ");
//                 }
//             }
//         }
// }

// week 3 - prog 3
// import java.util.Scanner;
// public class n1{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             int temp=n;
//             int c=0;

//             if(temp==0){
//                 c+=1;
//             }
//             else{
//                 while(Math.abs(temp)>0){
//                         temp/=10;
//                         c++;
//                 }
//             }
//             System.out.println(c);
//         }
// }

// week 3 - prog 4
// import java.util.Scanner;
// class Student{
//         private String n;
//         private int a;

//         public Student(String n, int a){
//                 this.n=n;
//                 this.a=a;
//         }
//         public String getname(){
//                 return n;
//         }
//         public int getage(){
//                 return a;
//         }
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 String na=sc.next();
//                 int age=sc.nextInt();
//                 Student st=new Student(na,age);
//                 System.out.println("Name: "+st.getname()+", Age: "+st.getage());
//                 sc.close();
//         }
//    }

// week 3 - prog 5
// import java.util.*;
// class cs1{
//         void add(int p, int q){
//                 System.out.println(p+q);
//         }
// }
// class cs2 extends cs1{
//    void mul(int a, int b){
//         System.out.println((a*b));
//    }
//    void task(int a, int b){
//         System.out.println((a*a)+(b*b));
//    }
// }
// public class n1{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             cs2 ob=new cs2();
//             int a=sc.nextInt();
//             int b=sc.nextInt();
//             ob.add(a,b);
//             ob.mul(a,b);
//             ob.task(a,b);
//         }
//}

// week 4 - prog 1 
// In Java, if no access modifier is written before a class member (variable or method), it is called Default Access Modifier.
// import java.util.*;
// public class n1{
//         static class Student{
//                 int roll;
        
//         Student(int r){
//                 roll=r;
//         }
//    }
//    public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int r=sc.nextInt();
//                 Student s=new Student(r);
//                 System.out.print("Roll No. is: "+s.roll);
        
//    }
// }

// week 4 - prog 2
// import java.util.Scanner;
// public class n1{
//         static class Car{
                // public int speed; //use of pulbic makes it universally available outside the class too 
//         }

//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int s=sc.nextInt();
//                 Car c=new Car();
//                 c.speed=s;
//                 System.out.print("Speed of the car is: "+s+"kmph");
//         }
// }

// week 4 - prog 3
// import java.util.*;
// public class n1{ //use of private methods and how these can be accessed
//         static class Account{
//                 private int bal;

//                 public void setbalance(int b){
//                         bal=b;
//                 }

//                 public int getbalance(){ //if u use void - it doesnt return anything
//                         return bal;
//                 }
//         }
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int b=sc.nextInt();
//             Account a=new Account();
//             a.setbalance(b);
//             System.out.print("Account balance is: "+a.getbalance());
//         }
// }

// week 4 - prog 4
// import java.util.Scanner;
// public class n1{ // how a protected variable can be accessed
//         static class Employee{
//                protected int sal;
//         }
//         static class Manager extends Employee{ }
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int s=sc.nextInt();
//                 Manager m=new Manager();
//                 m.sal=s;
//                 System.out.print("Salary is : "+s);
//                 sc.close();
//         }
// }

// week 4 - prog 5
// In Java, Method Overloading means defining multiple methods with the same name but different parameters.
// import java.util.*;
// public class n1{
//         static class Calculator{
//                 public int add(int a, int b){
//                         return a+b;
//                 }
//                 private int add(int a, int b, int c){
//                         return a+b+c;
//                 }
//                 public void print(int x, int y, int z){
//                         System.out.println("Sum of 3 numbers: "+add(x,y,z));
//                 }
//         }
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();
//                 int x=sc.nextInt();
//                 int y=sc.nextInt();
//                 int z=sc.nextInt();
//                 Calculator c=new Calculator();
//                 System.out.println("Sum of 2 numbers: "+c.add(a,b));
//                 c.print(x,y,z);
//                 sc.close();
//         }
// }

// week 5 -prog 1
// An interface Number is defined in the following program. You have to declare a class A, which will implement the interface Number. Note that the method findSqr(n) will return the square of the number n.
// import java.util.*;
// interface Number{
//         int fisqr(int i);
// }
// class A implements Number{
//         public int fisqr(int i){
//                 return i*i;
//         }
// }
// public class n1{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         A a=new A();
//         int i=sc.nextInt();
//         System.out.println(a.fisqr(i));
//     }
// }

// week 5 - prog 2
/* This program is to find the GCD (greatest common divisor) of two integers writing a recursive function findGCD(n1,n2).

Your function should return -1, if the argument(s) is(are) negative (zero is allowed). */

// import java.util.*;
// interface GCD{
//         public int fgcd(int n1, int n2);
// }

// class b implements GCD{
//         public int fgcd(int n1, int n2){
//                 if(n1<0 || n2<0)
//                    return -1;
//                 if(n2==0)
//                    return n1;
//                 return fgcd(n2, n1%n2);
//         }
// }
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();
//                 b c=new b();
//                 System.out.println(c.fgcd(a,b));
//                 sc.close();
//         }
// }

// week 5 - prog 3
/* Complete the code segment to catch the ArithmeticException in the following, if any.

On the occurrence of such an exception, your program should print “Exception caught: Division by zero.”

If there is no such exception, it will print the result of division operation on two integer values.
 */
// import java.util.Scanner;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();
//                 int r;
//                 try {
//                     r=a/b;
//                     System.out.println(r);
//                 } catch (ArithmeticException e) {
//                         System.out.println("Exception caught: Division by zero");               
//                 }
//         }
// }

// week 5 - prog 4
/* In the following program, an array of integer data to be initialized.

During the initialization, if a user enters a value other than integer value, then it will throw InputMismatchException exception.

On the occurrence of such an exception, your program should print “You entered bad data.”

If there is no such exception it will print the total sum of the array. */
// import java.util.*;
// public class n1{
//         public static void main(String[]ars){
//                 Scanner sc=new Scanner(System.in);
//                 int l=sc.nextInt();
//                 int[] n=new int[l]; //initialisation of an array
//                 int s=0;
//                 try {
//                     for(int i=0; i<l; i++){
//                         n[i]=sc.nextInt();
//                         s+=n[i];
//                     }
//                 } catch (InputMismatchException e) {
//                         System.out.println("you entered bad data");
//                 }
//         }
// }

// week 5 - prog 5
/* In the following program, there may be multiple exceptions.

You have to complete the code using only one try-catch block to handle all the possible exceptions.

For example, if user’s input is 1, then it will throw and catch “java.lang.NullPointerException“ */
// import java.util.*;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int i=sc.nextInt();
//                 int j;
//                 try {
//                     switch(i){
//                         case 0:
//                                 int z=0;
//                                 j=92/z;
//                                 break;
//                         case 1:
//                                 int b[]=null;
//                                 j=b[0];
//                                 break;
//                         default:
//                                 System.out.println("No Exception");
//                     }
//                 } catch (Exception e) {
//                         System.out.println(e);
//                 }
//         }
// }

// week 6 - prog 1
/* In Java, some operations can cause run-time errors, for example dividing a number by zero.
We can use a try-catch block to handle such errors and avoid program crashes.

Task:

Read two integers from the user

Divide the first number by the second inside a try-catch block

If the second number is zero, print "Cannot divide by zero"

Otherwise, print the result

This task introduces basic run-time error handling in a safe and controlled way. */
// import java.util.*;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();
//                 try {
//                     System.out.println("Result is: "+(a/b));
//                 } catch (ArithmeticException e) {
//                         System.out.println("Cannot divide by zero");
//                 }
//         }
// }

// week 6 - prog 2 & prog 3
/* In Java, nested try-catch blocks allow handling multiple levels of errors separately.
You can place one try-catch block inside another to handle different types of errors in different places.

Programming Assignment:

Read two integers from the user

Inside an outer try-catch block, perform the following:

Inside a nested try block, divide the first number by the second

If division by zero occurs, handle it with the inner catch block

In the outer catch block, handle any other unexpected errors

Print appropriate messages for each scenario

This programming assignment introduces nested try-catch structure. */
// import java.util.*;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();
//                 try {
//                         try {
//                             System.out.println("Result is: "+(a/b));
//                         } catch (ArithmeticException e) {
//                                 System.out.println("Cannot divide by zero");
//                         }
                    
//                 } catch (Exception e) {
//                         System.out.println(e);
//                 }
//                 sc.close();
//         }
// }

// week 6 - prog 4
/* Programming Assignment:

Read two integers from the user

Inside a try block, divide the first number by the second

If division by zero occurs, show an error message using catch block

Use a finally block to print "Program Ended" no matter what happens */
// import java.util.*;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();
//                 try {
//                         try {
//                             System.out.println("Result is: "+(a/b));
//                         } catch (ArithmeticException e) {
//                                 System.out.println("Cannot divide by zero");
//                         }
                    
//                 } catch (Exception e) {
//                         System.out.println(e);
//                 }
//                 finally{
//                         System.out.println("Program ended");
//                 }
//                 sc.close();
//         }
// }

// week 6 - prog 5
/* Programming Assignment:

Create a method called calculateSquareRoot

The method reads a number and returns its square root

If the number is negative, it throws an Exception

In the main method, use a try-catch block to handle the error

This demonstrates how to use throws and handle errors safely in the caller method. */
// import java.util.Scanner;
// public class n1{
//         public static double square(double n) throws Exception{
//                 if(n<0){
//                         throw new Exception();
//                 }
//                 return Math.sqrt(n);
//         }
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             double n=sc.nextDouble();
//             try {
//                 double r=square(n);
//                 System.out.println("Square root is: "+r);
//             } catch (Exception e) {
//                 System.out.println("Cannot find the square root of negative numbers");
//             }
//         }
// }

// week 7 - prog 1
// 

// week 7 - prog 2
// import java.util.*;
// public class n1{
//         public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int[] a=new int[n];
//            for(int i=0; i<n; i++){
//                 a[i]=sc.nextInt();
//            } 
//            int r=sc.nextInt();
//            System.out.println("Original array: "+Arrays.toString(a));
//            a=removeAll(a,r);
//            System.out.println("Arrays after removing "+r+": "+Arrays.toString(a));
//         }
//         public static int[] removeAll(int[]a, int r){
//                 int[]re=new int[a.length];
//                 int i=0;
//                 for(int val:a){
//                         if(val!=r){
//                                 re[i++]=val;
//                         }
//                 }
//                 return Arrays.copyOf(re,i);
//         }
// }

// week 7 - prog 3 - sum of all prime numbers
// import java.util.*;
// public class n1{
//         public static boolean prime(int n){
//                 if(n<2) return false;
//                 for(int i=2; i*i<=n; i++){
//                         if(n%i==0) return false;
//                 }
//                 return true;
//         }
//         public static int psum(int a, int b){
//                 int s=0;
//                 for(int i=a; i<=b; i++){
//                         if(prime(i)) s+=i;
//                 }
//                 return s;
//         }
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 int m=sc.nextInt();
//                 System.out.println("Sum of prime numbers: "+psum(n,m));
//         }
// }

// week 7 - prog 4 - implemented threads
/* Code to create two threads, one printing even numbers and the other printing odd numbers.

§ The PrintNumbers class is declared, and it implements the Runnable interface. This interface is part of Java's concurrency support and is used to represent a task that can be executed concurrently by a thread.

§ Create a constructor of this class that takes two private instance variables (start and end) to represent the range of numbers that will be printed by the thread.

§ Create a run method that is required by the Runnable interface and contains the code that will be executed when the thread is started. In this case, it should prints odd numbers within the specified range (start to end) using a for loop.

§ Hint: Thread.currentThread().getName() returns the name of the currently executing thread, which is useful for identifying which thread is printing the numbers.

Follow the naming convention as given in the main method of the suffix code. */
// import java.util.*;
// class printnum implements Runnable{
//         private int s;
//         private int e;
//         public printnum(int s, int e){
//                 this.s=s;
//                 this.e=e;
//         }
//         @Override
//         public void run(){
//                 for(int i=s; i<=e; i+=2){
//                         System.out.println(Thread.currentThread().getName()+": "+i);
//                 }
//         }
// }
// class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int es=sc.nextInt();
//                 int ee=sc.nextInt();
//                 int os=sc.nextInt();
//                 int oe=sc.nextInt();
//                 Thread et=new Thread(new printnum(es,ee),"EvenThread");
//                 Thread ot=new Thread(new printnum(os,oe),"Oddthread");
//                 et.start();
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                         e.printStackTrace();
//                 }
//                 ot.start();
//                 sc.close();
//         }
// }

// week 7 - prog 5
/* Due on 2025-09-11, 23:59 IST
 Implement a Simple Password Validator

In this task, you need to implement a password validation system using Java. The goal is to check if a given password meets the following conditions:

Minimum Length Requirement: The password must be at least 8 characters long.
Uppercase Letter Requirement: The password must contain at least one uppercase letter (A-Z).
Number Requirement: The password must contain at least one numeric digit (0-9).
If the password meets all three conditions, print "Valid Password". Otherwise, print "Invalid Password".

Input Format:

A single string representing the password (can contain alphabets, numbers, and special characters).
Output Format:

Print "Valid Password" if the password satisfies all the conditions.
Otherwise, print "Invalid Password" */
// import java.util.*;
// public class n1{
//         private String p;
//         public n1(String p){
//                 this.p=p;
//         }
//         public boolean isvalid(String p){
//                 if(p.length()<8) return false;
//                 boolean u=false;
//                 boolean d=false;
//                 for(char c:p.toCharArray()){
//                         if(Character.isUpperCase(c)) u=true;
//                         if(Character.isDigit(c)) d=true;
//                         if(u&&d) return true;
//                 }
//                 return false;
//         }
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 String p=sc.nextLine();
//                 n1 v=new n1(p);
//                 if(v.isvalid(p)){
//                         System.out.println("Valid Passowrd");
//                 }
//                 else{
//                         System.out.println("Inavlid Passowrd");
//                 }
//                 sc.close();
//         }
// }

// week 8 - prog 1
/* In Java, you can run multiple tasks at the same time using Multithreading.
The simplest way to create a thread is by extending the built-in Thread class.

What is a Thread?

A thread is a small unit of a program that runs independently

Multiple threads can run in parallel, improving efficiency

Programming Assignment:

Create a class called MyThread that extends Thread

In its run() method, print "Thread is running"

In the main method, create an object of MyThread and start the thread

This helps you understand the basic way to create and start a thread in Java. */
// public class n1{
//         static class Mythread extends Thread{
//                 @Override
//                 public void run(){
//                         System.out.println("Thread is running");
//                 }
//         }
//         public static void main(String[]args){
//                 Mythread t=new Mythread();
//                 t.start();
//         }
// }

// week 8 - prog 2
/* Problem Statement
In Java, another common way to create threads is by implementing the Runnable interface.

What is Runnable?

Runnable is an interface with a single method called run()

You can pass a Runnable object to a Thread and start the thread

Why use Runnable?

It allows your class to extend another class, as Java supports single inheritance

It provides flexibility in thread creation

Programming Assignment:

Create a class called MyRunnable that implements Runnable

In its run() method, print "Runnable thread is running"

In the main method, create a Thread object using MyRunnable and start the thread

This demonstrates thread creation using the Runnable interface. */
// public class n1{
//         static class Myrunnable implements Runnable{ //for Runnable use implements and for threads use extends
//                 @Override
//                 public void run(){
//                         System.out.println("Runnable thread is running");
//                 }
//         }
//         public static void main(String[]args){
//                 Myrunnable r=new Myrunnable();
//                 Thread t=new Thread(r);
//                 t.start();
//         }
// }

// week 8 - prog 3
/* Programming Assignment:

Create a class called MyThread that extends Thread

Inside its run() method, print "Thread is running"

In the main method:

Create a MyThread object

Print "Thread state before start"

Start the thread

Print "Thread state after start"

Wait for thread to finish using join()

Print "Thread state after completion"

This shows how thread state changes as the thread runs. */
// public class n1{
//         static class Mythread extends Thread{
//                 @Override
//                 public void run(){
//                         System.out.println("Thread is running");
//                 }
//         }
//         public static void main(String[]args){
//                 Mythread t=new Mythread();
//                 System.out.println("Thread state before start");
//                 t.start();
//                 System.out.println("Thread state after starting");
//                 try {
//                     t.join();
//                 } catch (InterruptedException e) {
//                 }
//                 System.out.println("Thread state after completion");
//         }
// }

// week 8 - prog 4
/* In Java, each thread has a priority, a number from 1 (lowest) to 10 (highest).
Priority suggests how important a thread is, though actual scheduling depends on the system.

Programming Assignment:

Create a class MyThread that extends Thread

In the main method:

Create a MyThread object

Set its priority to 8

Start the thread

Print the thread's priority after setting

No output should come from the thread's run() method to avoid output mismatch. */
// public class n1{ //setting priority
//         static class Mythread extends Thread{
//                 @Override
//                 public void run(){
//                         System.out.println("Thread is running");
//                 }
//         }
//         public static void main(String[]args){
//                 Mythread t=new Mythread();
//                 t.setPriority(8);
//                 t.start();
//                 System.out.println("Thread priority is: "+t.getPriority());
//         }
// }

// week 8 - prog 5
/* What is a Thread?
Imagine your computer doing many tasks at once — for example:

Playing music

Downloading files

Browsing the internet

In Java, each small task that runs independently is called a Thread.
Threads help programs run faster by working at the same time.

Why Synchronization?
When multiple threads work on the same thing together, they may interfere with each other.
For example:

Two threads try to update the same number at the same time

The final result may be wrong

What is Synchronization?

It is like putting a lock

Only one thread can work on the shared thing at a time

This prevents problems caused by threads disturbing each other

Programming Assignment:

Create a class Counter with a number count starting from 0

Write a method increment() to increase the number by 1, using synchronized keyword

Create a thread class called MyThread that runs the increment() method 1000 times

In main, run two threads to increase the number

After both threads finish, print the final count

This shows how to use synchronization to avoid problems when multiple threads share data.
 */
// public class n1{
//         static class Counter{
//                 int c=0;
//                 public synchronized void increment(){
//                         c++;
//                 }
//         }
//         static class Mythreads extends Thread{
//                 Counter c;
//                 Mythreads(Counter c){
//                         this.c=c;
//                 }
//                 @Override
//                 public void run(){
//                         for(int i=0; i<=100; i++){
//                                 c.increment();
//                         }
//                 }
//         }
//         public static void main(String[] args) {
//             Counter co=new Counter();
//             Mythreads t1=new Mythreads(co);
//             Mythreads t2=new Mythreads(co);
//             t1.start();
//             t2.start();
//             try {
//                t1.join();
//                t2.join(); 
//             } catch (InterruptedException e) {
//             }
//             System.out.println("Final count is: "+co.c);
//         }
// }

// week 9 - prog 1
/* Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5, which replaces all input elements with values 0 by 1 and 1 by 0. An example is shown below:

INPUT:
               00001
               00001
               00001
               00001
               00001

OUTPUT:
               11110
               11110
               11110
               11110
               11110

Note the following points carefully:
1. Here, the input must contain only 0 and 1.

2. The input and output array size must be of dimension 5 × 5.
3. Flip-Flop: If 0 then 1 and vice-versa. */
// import java.util.*;
// public class n1{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int[][]arr=new int[5][5];
//                 for(int i=0; i<5; i++){
//                         String r=sc.nextLine().trim();
//                         if(r.length()!=5){
//                                 return;
//                         }
//                         for(int j=0; j<5; j++){
//                                 char c=r.charAt(j);
//                                 if(c!='0' && c!='1'){
//                                         return;
//                                 }
//                                 arr[i][j]=c-'0';
//                         }
//                 }
//                 for(int i=0; i<5; i++){
//                         for(int j=0; j<5; j++){
//                                 int f=(arr[i][j]==0)?1:0;
//                                 System.out.print(f);
//                         }
//                         System.out.println();
//                 }
//                 sc.close();
//         }
// }

// week 9 - prog 2
/* Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division. */
// import java.util.*;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 String n=sc.nextLine();
//                 sc.close();
//                 double re=0.0;
//                 char o=' ';
//                 int oi=-1;
//                 for(int i=0; i<n.length(); i++){
//                         char c=n.charAt(i);
//                         if(c=='+'||c=='-'||c=='*'||c=='/'){
//                                 o=c;
//                                 oi=i;
//                                 break;
//                         }
//                 }
//                 if(oi==-1){
//                         System.out.println("Invalid Expression");
//                 }
//                String l=n.substring(0,oi).trim();
//                String r=n.substring(oi+1).trim();
//                int n1=Integer.parseInt(l);
//                int n2=Integer.parseInt(r);
//                switch(o){
//                 case '+':
//                         re=(double)n1+n2;
//                         break;
//                 case '-':
//                         re=(double)n1-n2;
//                         break;
//                 case '*':
//                         re=(double)n1*n2;
//                         break;
//                 case '/':
//                         if(n2==0){System.out.println("Not allowed");return;}
//                         re=(double)n1/n2;
//                         break;
//                 default:
//                         System.out.println("Unknown Operator");
//                         return;
//                }
//                long ro=Math.round(re);
//                System.out.println(n1+""+o+n2+" = "+ro);
//         }
// }

// week 9 - prog 3
/* Write a Java program that utilizes multithreading to calculate and print the squares of numbers from a specified begin to a specified end.

The main method is already created.

You need to design a SquareThread class that has two members,

§ int begin;

§ int end;

Each thread should sequentially print the squares of numbers from begin to end (both inclusive).

The same code will be used to create another thread that prints the sqaure of numbers from end to begin in reverse order.

(if begin is greater than end, print the square of each number in reverse order first)

The main method will first call SquareThread with begin and end and then in reverse order.

The class you create should be able to handle such case and print as required in the correct order.

HINT: use the keyword `synchronized` in the run method. */
// import java.util.Scanner;
// class square extends Thread{
//         private int b;
//         private int e;
//         public square(int b, int e){
//                 this.b=b;
//                 this.e=e;
//         }
//         synchronized public void run(){
//                 if(b>e){
//                         for(int i=b; i>=e; i--){
//                                 System.err.println(i*i);
//                         }
//                 }
//                 else{
//                         for(int i=b; i<=e; i++){
//                                 System.out.println(i*i);
//                         }
//                 }
//         }
// }
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 int b=sc.nextInt();
//                 int e=sc.nextInt();
//                 square s1=new square(b,e);
//                 square s2=new square(e,b);
//                 s1.start();
//                 s2.start();
//         }
// }

// week 9 - prog 4
/* Complete the code segment to catch the exception in the following, if any.

On the occurrence of such an exception, your program should print

“Please enter valid data” .

If there is no such exception, it will print the square of the number entered. */
// import java.io.*;
// class n1{
//         public static void main(String[] args) {
//             try {
//                 InputStreamReader r=new InputStreamReader(System.in);
//                 BufferedReader b=new BufferedReader(r);
//                 String n=b.readLine();
//                 int x=Integer.parseInt(n);
//                 System.out.println(x*x);
//             } catch (Exception e) {
//                 System.out.println("Please enter valid data");
//             }
//         }
// }
// when we use 'util' we basically go for scanner class for accepting the value from the user, else when v use 'io' package; we use InputStreamReader, BufferedReader and parse for accepting the value from the user

// week 9 - prog 5
/* Define a class Point with members

§ private double x;

§ private double y;

and methods:

§ public Point(double x, double y){}  // Constructor to create a new point?

§ public double distance(Point p2){} // Function to return the distance of this Point from another Point */
// import java.util.*;
// public class n1{
//         public static void main(String[]args){
//                 Scanner sc=new Scanner(System.in);
//                 double x1=sc.nextDouble();
//                 double y1=sc.nextDouble();
//                 double x2=sc.nextDouble();
//                 double y2=sc.nextDouble();
//                 Point a1= new Point(x1, y1);
//                 Point a2= new Point(x2, y2);
//                 System.out.println(a1.distance(a2));
//         }
// }
//         class Point{
//                 private double x;
//                 private double y;

//                 public Point(double x, double y){
//                         this.x=x;
//                         this.y=y;
//                 }
//                 public double distance(Point p2){
//                         double dx=this.x-p2.x;
//                         double dy=this.y-p2.y;
//                         return Math.sqrt(dx*dx+dy*dy);
//                 }
// }

// week 10 - prog 1
/* Problem Statement
What is JDBC?
JDBC means Java Database Connectivity, which allows Java programs to work with databases.

Before writing database programs, you must import the correct packages. Without proper imports, the code will not compile.

Programming Assignment:

Import the necessary JDBC packages so the program can compile

You only need to complete the import section

The output "import successful" is printed automatically

This helps you practice the correct way to prepare Java programs for database work. */
// import java.sql.Connection;
// import java.sql.DriverManager;
// public class n1{
//         public static void main(String[]args){
//                 Connection con=null;
//                 DriverManager dm=null;
//                 System.out.println("Import Successful");
//         }
// }

// week 10 - prog 2
/* Problem Statement
What is a JDBC Connection String?
To connect a Java program to a database, we use a special sentence called a connection string.
It tells Java:

Which database to use

Where the database is located

In this assignment, you will practice writing the correct JDBC connection string for SQLite database.

Programming Assignment:

Write the correct connection string for an SQLite database called test.db

The rest of the program prints "connection string ready" if your string is correct

This helps beginners practice writing JDBC connection strings safely, without actual database access. */
// public class n1{
//         public static void main(String[] args) {
//             String url="jdbc:sqlite:test.db";
//             if(url.equals("jdbc:sqlite:test.db")){
//                 System.out.println("Connection String is ready");
//             }
//             else{
//                 System.out.println("Incorrect connection String");
//             }
//         }
// }

// week 10 - prog 3
/* What is an SQL Insert Statement?
When working with databases, we use the INSERT command to add new records (data) into a table.

In this assignment:

Imagine there is a table called students with two columns: id and name

You will practice writing the correct SQL insert statement as a text string

No actual database operation is performed, only the string is checked

Programming Assignment:

Complete the SQL insert statement to add a student with id 1 and name 'Alice'

The rest of the code checks your string and prints "insert statement ready" if correct

This task helps beginners practice writing SQL commands safely. */
// public class n1{
//         public static void main(String[]args){
//                 String sql="INSERT INTO students (id,name) VALUES (1,'Alice')";
//                 if(sql.equals("INSERT INTO students (id,name) VALUES (1,'Alice')")){
//                         System.out.println("Insert statement ready");
//                 }
//                 else{
//                         System.out.println("Incorrect statement");
//                 }
//         }
// }

// week 10 - prog 4
/* What is a SQL SELECT Statement?
The SELECT statement is used to get data from a database table.
You can choose to fetch all columns or specific columns.

In this assignment:

Imagine a table called students with two columns: id and name

You will practice writing a SQL statement to fetch all columns for all students

Programming Assignment:

Write a SQL SELECT statement as a text string to get all data from students table

The rest of the program checks your string and prints "select statement ready" if correct

This task helps beginners practice safe SQL reading commands. */
// public class n1{
//         public static void main(String[] args) {
//             String s="SELECT * FROM students;";
//             if(s.equals("SELECT * FROM students;")){
//                 System.out.println("select statement ready");
//             }
//             else{
//                 System.out.println("Incorrect statements");
//             }
//         }
// }

// week 10 -prog 5
/* What is an SQL UPDATE Statement?
The UPDATE command is used to change existing data in a database table.

In this assignment:

Imagine a table called students with two columns: id and name

You will write a SQL statement to update the name of the student with id 1 to 'Bob'

Programming Assignment:

Write the correct SQL UPDATE statement as a text string

The rest of the code checks your string and prints "update statement ready" if correct

This helps beginners practice safe SQL update syntax. */
// public class n1{
//         public static void main(String[] args) {
//             String s="UPDATE students SET name='Bob' WHERE id=1;";
//             if(s.equals("UPDATE students SET name='Bob' WHERE id=1;")){
//                 System.out.println("Update statement ready");
//             }
//             else{
//                 System.out.println("incorrect statement");
//             }
//         }
// }

// week 11 - prog 1
/* The following code needs some package to work properly.

Write appropriate code to

§ import the required package(s) in order to make the program compile and execute successfully.
(Ignore the hidden code)  */
import java.util.Scanner;
import java.sql.*;
import static java.sql.DriverManager.getConnection;
public class n1{
        public static void main(String[] args) {
            try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if (s == 1) {
                System.out.print(conn.isValid(1));
            }
            conn.close();
         } catch (Exception e) {
            System.out.println(e);
        }   
        }
}