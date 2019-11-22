import java.util.Scanner;

/**
 * Takes user inputted temperature and converts the temperature from celsius to fahrenheit
 *
 */
public class temperature {


    public static void main(String[] args){
    double user_temp; //variable for user input
    final double CEL_CONV_FAC = 9.0/5.0; //factor to multiply the user input by
    final int CEL_ADD_FAC = 32;
    Scanner in = new Scanner(System.in);
        System.out.println("Enter a temperature to be converted: ");
        user_temp = in.nextDouble();

        double result = user_temp * CEL_CONV_FAC + CEL_ADD_FAC;
        System.out.printf("You entered %.1f C, which is %.1f F!", user_temp, result);

    }
}
