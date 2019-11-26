import java.util.Scanner;

public class Divisible {

    public static boolean isDivisible(int n, int m){
        boolean result = false;
        if (n%m == 0){
            result = true;
        }
        return result;
    }

    public static void main(String[] args){
        int user_num1;
        int user_num2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers and I will tell you if the first number is divisible by the second: ");
        user_num1 = in.nextInt();
        user_num2 = in.nextInt();

        System.out.print(isDivisible(user_num1, user_num2));
    }
}
