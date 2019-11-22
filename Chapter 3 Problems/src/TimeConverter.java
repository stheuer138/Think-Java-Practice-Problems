import java.util.Scanner;

/**
 * Takes user inputted time in seconds and converts it to hours, minutes, and seconds
 *
 */
public class TimeConverter {

    public static void main(String[] args){
    int user_input;
    int hours;
    int minutes;
    int seconds;
    int placeholder;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter an amount of time in seconds:" );
    user_input = in.nextInt();

    placeholder = user_input / 60; //gives the number of minutes as an int
    seconds = user_input % 60; //gives number of seconds
    hours = placeholder / 60; //gives the number of hours as an int
    minutes = placeholder % 60; //gives the number of minutes as an int, hopefully

        System.out.printf("%d seconds is %d hours, %d minutes, and %d seconds.", user_input, hours, minutes, seconds);
    }
}
