import java.util.Random;
import java.util.Scanner;

public class GuesMyNumber {

    public static void numChecker(){
        //generate a random value between 1 & 100 for the user to guess at
        int randVal;
        Random random = new Random();
        randVal = random.nextInt(100) + 1;
        int user_input;
        Scanner in = new Scanner(System.in);

        //asks user for a guess
        System.out.print("I'm thinking of a number between 1 and 100 inclusive. Enter a guess: ");
        user_input = in.nextInt();

        //calls the recursive method for the user to keep guessing the random value
        //needed the if statement because I made the recursive method a boolean for some reason
        //yeet definitely didn't need an if statement
        //for some reason the program didn't want to enter the if statment and print... idk why
        //I've decided not to handle this if it returns false because I think the recursive method takes care of that
        recursiveNums(user_input, randVal);



    }
        //for the recursive method do an if else where the if is r==n and the else calls the method again
    public static boolean recursiveNums(int n, int r){
      boolean result = false;
      int difference;
      int user_input;
      Scanner in = new Scanner(System.in);

      if (n == r){
          result = true;
          System.out.println("You guessed the right number!");
      }else{
          difference = Math.abs(n-r);
          if (n > r){
              System.out.printf("That guess was high by %d! Try another number: \n", difference);
              user_input = in.nextInt();
          }else{
              System.out.printf("That guess was low by %d! Try another number: \n", difference);
              user_input = in.nextInt();
          }
          recursiveNums(user_input, r);
      }
      return result;
    }

    public static void  main(String[] args){
    numChecker();
    }
}
