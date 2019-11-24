import java.util.Random;
import java.util.Scanner;

public class checkFermat {

    public static void fermatReport(int n){
        int valA;
        int valB;
        int valC;
        Random random = new Random();

        valA = random.nextInt();
        valB = random.nextInt();
        valC = random.nextInt();
        if(fermatHelper(valA, valB, valC, n)){
            System.out.println("Holy smokes Fermat was wrong!!");
        }else{
            System.out.println("That number didn't work.");
        }

    }

    private static boolean fermatHelper(int a, int b, int c, int n){
        double term1;
        double term2;
        double result;
        boolean flag = false;

        term1 = Math.pow(a, n);
        term2 = Math.pow(b,n);
        result = Math.pow(c,n);

        if(term1 + term2 == result){
            flag = true;
            System.out.printf("a = %d, b = %d, c = %d, n = %d\n", a, b, c, n);
        }else if(n > 2){
            fermatHelper(a, b, c, n-1);
        }
        return flag;

    }

    public static void main(String[] args){
        int numTestVals;
        //I think this is broken somewhere but I can't tell where

        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to test? ");
        numTestVals = in.nextInt();
        fermatReport(numTestVals);
    }

}
