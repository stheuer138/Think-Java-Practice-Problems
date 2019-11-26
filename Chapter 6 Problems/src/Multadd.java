import java.util.Scanner;

public class Multadd {

    public static double multadd(double a, double b, double c){
        return a * b + c;
    }

    public static void main(String[] args){
        double user_num1;
        double user_num2;
        double user_num3;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 numbers to add: ");
        user_num1 = in.nextDouble();
        user_num2 = in.nextDouble();
        user_num3 = in.nextDouble();
        System.out.println(multadd(user_num1, user_num2, user_num3));

        double val1 = Math.sin((Math.PI)/4) + (Math.cos(Math.PI)/4)/2;
        double val2 = Math.log(10.0) + Math.log(20.0);
    }
}
