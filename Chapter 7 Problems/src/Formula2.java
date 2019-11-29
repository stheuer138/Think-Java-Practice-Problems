import java.util.Scanner;

public class Formula2 {

    public static double squareRoot(double a){
        double b;
        double c;
        double temp;
        b = a/2;
        c = 0;

        //lol welp this is an infinite loop for some reason.... oops
        while(Math.abs(b-c) > 0.01){
            temp = c;
            c = (b + a/b)/2;
            b = temp;
        }
        return c;
    }

    public static void main(String[] args){
        System.out.print(squareRoot(4));
    }
}
