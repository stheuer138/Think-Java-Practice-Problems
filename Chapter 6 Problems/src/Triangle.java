import java.util.Scanner;

public class Triangle {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = true;
         if (a > b + c || c > a + b || b > a + c){
             result = false;
         }

        return result;
    }

    public static void main(String[] args){
        int user_num1;
        int user_num2;
        int user_num3;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers and I will tell you true if they make a triangle: ");
        user_num1 = in.nextInt();
        user_num2 = in.nextInt();
        user_num3 = in.nextInt();

        System.out.print(isTriangle(user_num1, user_num2, user_num3));
    }
}
