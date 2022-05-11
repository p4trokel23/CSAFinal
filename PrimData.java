import java.util.Scanner;
/**
 * Write a description of class PrimData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimData
{
    // method signature is the visibility, return, name, and paramaters
    public static void main(String[]args)
    {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name:  ");
        String name = scan.nextLine();
       
        System.out.print("Enter Your Age:  ");
        int age = scan.nextInt();
       
        System.out.println("hello there, "+ name);
       
        System.out.println("your age is"+ age);
        */
       /*
       
        byte num1 =0;
        int numCounter = 0;
        // write code that will loop repetedly and display positive
        // and negitive 3 times then stop
        while (numCounter<3)
        {
            System.out.println(num1);
            num1 = (byte)(num1 + 1);
           
            if(num1==0)
            {
                numCounter++;
            }
        }
        */
       /*
       double num2 = 0;
       int counter = 0;
       while(counter<10)
       {
           num2 = num2 + 0.1;
           counter++;
           System.out.println(num2);
       }
       System.out.println(num2==1.0);
       *//*
        int counter2 = Integer.MAX_VALUE-1000;
       while(counter2 > 0 )
       {
           System.out.println(counter2);
           counter2++;
       }
       */
       
      double rand = Math.random();
      System.out.println(rand);
      rand = rand*10;
      rand++;
     
      int rand1 = (int)(Math.floor(rand));
      rand1 = (int)rand;
     
      System.out.println(rand1);
    }}
