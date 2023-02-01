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

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the card (1-13): ");
        int value = scan.nextInt();
        System.out.print("Enter the suit of the card (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
        int suitIndex = scan.nextInt() - 1;
        scan.close();
        String suit = Card.SUITS[suitIndex];

        boolean match = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == value && hand[i].getSuit().equals(suit)) {
                match = true;
                break;
            }
        }

        if (match) {

            printInfo();
        } else {
            System.out.println("Sorry, you have choosen the wrong card");
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }

}