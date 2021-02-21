/*Name: Christina Khidhir
 *Date: 03/11/2017
 *Purpose: Creating a working lock system.
 */

import java.awt.*;
import java.io.*;
import java.util.*;

public class Khidhir_codethelocksmith
{
    public static void main (String[] args)
    {
        //Welcome Message
        System.out.println ("**************************************************");
        System.out.println ("               Welcome To Locksmith               ");
        System.out.println ("**************************************************");

        //Variable Declaration
        Scanner kbscanner = new Scanner (System.in);
        int user_guess;

        //Creates the two locks
        Lock lock_1 = new Lock (815);
        Lock lock_2 = new Lock (514);

        //Closes the locks
        lock_1.close();
        lock_2.close();

        //Input and Processing and Output
        
        //Displays the status of both locks at the begining
        if (lock_1.isOpen() == true)
        {
            System.out.println ("Lock one is open");
        }
        else if (lock_1.isOpen() == false)
        {
            System.out.println ("Lock one is closed");
        }
        
        if (lock_2.isOpen() == true)
        {
            System.out.println ("Lock two is open");
        }
        else if (lock_2.isOpen() == false)
        {
            System.out.println ("Lock two is closed");
        }

        //Allows the user to input the correct combonations for the two locks
        while (lock_1.isOpen() == false)                                    //Allows the user to input the first correct combonation within three tries
        {
            while (lock_1.get_tries() == 3)                                 //Infinite while loop that simulates a jammed code as the cause of three wrong guesses
            {
                System.out.println ("*LOCK IS JAMMED*");
            }
            System.out.print ("Please enter the first lock combo: ");
            user_guess = kbscanner.nextInt();
            lock_1.open(user_guess);
        }

        while (lock_2.isOpen() == false)                                    //Allows the user to input the second correct combonation within three tries
        {
            while (lock_2.get_tries() == 3)                                 //Infinite while loop that simulates a jammed code as the cause of three wrong guesses
            {
                System.out.println ("*LOCK IS JAMMED*");
            }
            System.out.print ("Please enter the second lock combo: ");
            user_guess = kbscanner.nextInt();
            lock_2.open(user_guess);
        }

        //Goodbye Message
        System.out.println ("**************************************************");
        System.out.println ("          Thanks For Using This Program!          ");
        System.out.println ("**************************************************");
    } // main method
} // Khidhir_codethelocksmith class