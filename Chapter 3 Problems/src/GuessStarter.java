import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


/**
 * Generates a random number and takes user input
 * compares the two to determine how far off the user was from the randomly generated number
 */
public class GuessStarter {

    public static void main(String[] args){
        int user_input;
        int randnum;
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        randnum = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 inclusive. Can you guess what it is?");
        System.out.print("Type a number: ");
        user_input = in.nextInt();
        System.out.printf("Your guess is: %d\n", user_input);
        System.out.printf("The number I was thinking of is: %d\n", randnum);
        int difference = Math.abs(user_input - randnum);
        System.out.printf("You were off by %d!\n", difference);




    }
}
