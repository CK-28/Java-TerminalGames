/*Name: Crestena Khidhir
 *Date: 07/04/2017
 *Purpose: A simple, terminal game of Rock, Paper, Scissors
*/

import java.io.*;
import java.util.*;

import javax.swing.JComboBox.KeySelectionManager;

public class Khidhir_coderockpaper
{
    public static void main (String[] args)
    {
        //Variable declaration
        int player_draw;                                                           //Holds the player's choice of draw
        int computer_draw;                                                         //Generates and holds a random draw for the computer
        String continuePlaying, test;
        
        Scanner kbscanner = new Scanner(System.in);

        //Welcome message
        System.out.println ("********************************************************");
        System.out.println ("           Welcome to Rock, Paper, Scissors!            ");
        System.out.println ("********************************************************");
        System.out.println ("Rock = 1, Paper = 2, Scissors = 3");                  //A follow up statement to show the user what each number corolates to

        do {                                                                       //Loops until the user chooses to exist the game

            player_draw = -1;
            computer_draw = (int) (Math.random() * 3) + 1;
            test = "";

            //Input
            System.out.print ("\nPlease enter your draw and press <Enter>: ");     //Prompts the user to input a number that corolates to their draw
            //Checking that the user input is a valid number
            while (player_draw == -1)
            {
                test = kbscanner.nextLine();

                try {
                    player_draw = Integer.parseInt(test);
                } catch (NumberFormatException exception) {
                    System.out.println ("[ERORR] Input is not a number.");
                }

                if (player_draw != 1 && player_draw != 2 && player_draw != 3) {
                    player_draw = -1;
                    System.out.print ("Please enter a valid response: ");
                }
            }

            //Processing and Output
            System.out.println (("\nPlayer Draws: ") + (player_draw));             //Used to preview to the user the results of their game
            System.out.println (("Computer Draws: ") + (computer_draw));

            //The following if-else statemetnts output who the winner is by comparing the draws of the two players
            //In the case of the user drawing a 1
            if (player_draw == 1 && computer_draw == 1) {
                System.out.println ("It's a Draw!");
            } else if (player_draw == 1 && computer_draw == 2) {
                System.out.println ("Computer Wins!");
            } else if (player_draw == 1 && computer_draw == 3) {
                System.out.println ("Player Wins!");
            }

            //In the case of the user drawing a 2
            if (player_draw == 2 && computer_draw == 1) {
                System.out.println ("Player Wins!");
            } else if (player_draw == 2 && computer_draw == 2) {
                System.out.println ("It's a Draw!");
            } else if (player_draw == 2 && computer_draw == 3) {
                System.out.println ("Computer Wins!");
            }

            //In the case of the user drawing a 3
            if (player_draw == 3 && computer_draw == 1)
            {
                System.out.println ("Computer Wins!");
            } else if (player_draw == 3 && computer_draw == 2) {
                System.out.println ("Player Wins!");
            } else if (player_draw == 3 && computer_draw == 3) {
                System.out.println ("It's a Draw!");
            }

            System.out.print ("\nWould you like to go again? (y/n): ");
            continuePlaying = kbscanner.nextLine();

        } while (continuePlaying.compareTo("y") == 0);

        kbscanner.close();

        //Goodbye message
        System.out.println ("\n********************************************************");
        System.out.println ("             Thank You For Playing The Game!            ");
        System.out.println ("********************************************************");
    }//main method
}//Khidhir_coderockpaper class
