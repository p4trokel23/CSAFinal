import java.util.Scanner;
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    /** creates and saves accounts that records scores and creates 
     statiscts for players. a geust account will exist so a player 
     can play without recording data. 
     * **/
    private String username, fn, ln, pswrd;
    private int highscore=0, gmsPL=0, gmsIN=0; 
    
    public static void main (String [] args)
    { 
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to LogicPuzzle!"+'\n'+ "You can sign in, create an account, or play as a guest");
        String res = scan.nextLine();
        if (res.indexOf("guest")>-1)
        {
          // create guest acount
        }
        
        if (res.indexOf("sign in")>-1||res.indexOf("log in")>-1||res.indexOf("login")>-1)
        {
          // call existing account
        }
        
        if (res.indexOf("create")>-1||res.indexOf("make")>-1)
        {
          // create account
        }
    }

     
    public Account (String fn, String ln)
    {
        
    }
    
    public Account ()
    {
        
    }
}
