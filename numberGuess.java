
import java.util.Scanner;

/**
 * Write a description of class numberGuess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class numberGuess
{
   
   
    public static void main (String[] args)
   {
        /*
        * algarythim choose ran number 1-10 inclusive.
        * then prompt the user to geuss that number
        * out put Sucess and number of geusses
        */
   
      Scanner scan = new Scanner(System.in);
     
      double rand = Math.random();
      rand = rand*10;
      rand++;
      int rand1 = (int)(Math.floor(rand));
     
      System.out.println("number chosen. Enter your geuss");
      int geuss = scan.nextInt();
      int counter = 1;
      while (geuss != rand1)
      {
          if (geuss > rand1)
          {
              System.out.println("To high, try again");
              counter++;
              geuss = scan.nextInt();
          }
          else if (geuss < rand1)
          {
              System.out.println("To low, try again");
              counter++;
              geuss = scan.nextInt();
          }

       }  
       
      System.out.println("Correct! Number of tries:"+ counter);
    }
}