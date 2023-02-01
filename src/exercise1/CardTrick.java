package exercise1;


/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @author Paul Bonenfant May 2020
 */

import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(random.nextInt(13) + 1);
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of the card between 1 and 13 : ");
        int value = input.nextInt();
        System.out.print("Please enter the suitValue of the card i.e. 1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs: ");
        int suitValue = input.nextInt() - 1;
        input.close();
        String suit = Card.SUITS[suitValue];

        boolean got = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == value && hand[i].getSuit().equals(suit)) {
                got = true;
                break;
            }
        }

        if (got) {

            printInfo();
        } else {
            System.out.println("OOPS, the card you requested was not found .");
        }
    }
    
//  "I'm done!"
    private static void printInfo() 
    
    {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Harnoor, but you can call me Noor");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Become a succcessfull programmer!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Saving");
        System.out.println("-- Cooking");
        System.out.println("-- Reading");
        System.out.println("-- Listening to different type of music");

        System.out.println();
    }

}
