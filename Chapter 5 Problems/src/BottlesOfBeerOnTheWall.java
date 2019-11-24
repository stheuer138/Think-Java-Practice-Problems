import java.util.Scanner;

public class BottlesOfBeerOnTheWall {
    public static void numBottles(int n){
        if (n > 0){
            System.out.printf("%d bottles of beer on the wall,\n", n);
            System.out.printf("%d bottles of beer,\n", n);
            System.out.println("ya' take one down, ya' pass it around,");
            n = n - 1;
            System.out.printf("%d bottles of beer on the wall.\n", n);
            numBottles(n);
        }else if(n == 0){
            System.out.println("No bottles of beer on the wall,\nno bottles of beer\nya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        }
    }

    public static void  main(String[] args){
        int user_input;
        Scanner in = new Scanner(System.in);

        System.out.print("How many bottles would you like to start with? ");
        user_input = in.nextInt();

        numBottles(user_input);
    }
}
