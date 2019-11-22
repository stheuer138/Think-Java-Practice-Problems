import java.util.Scanner;

public class TimeConversionMethods {
    public static void printAmerican(String d, String m, int n, int y){
        System.out.printf("American Format: %s, %s %d, %d\n", d, m, n, y);
    }

    public static void printEuropean(String d, String m, int n, int y){
        System.out.printf("European Format: %s, %d %s %d\n", d, n, m, y);
    }

    public static void main(String[] args){
        int user_date;
        String user_day;
        String user_month;
        int user_year;

        Scanner in = new Scanner(System.in);

        System.out.print("Hello! Please enter a day of the week: ");
        user_day = in.nextLine();
        System.out.print("Next, enter a number between 1 and 31: ");
        user_date = in.nextInt();
        System.out.print("Now enter a month of the year: ");
        in.nextLine();
        user_month = in.nextLine();
        System.out.print("Lastly, enter a year: ");
        user_year = in.nextInt();

        printAmerican(user_day, user_month, user_date, user_year);
        printEuropean(user_day, user_month, user_date, user_year);
    }
}
