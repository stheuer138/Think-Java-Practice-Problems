import java.util.Scanner;

public class Formulas {

    /*
    *Computes sum of odd integers from 1 to n
    *
    *@param odd integer value
    * @return sum off odd integers from 1 to n
    */
    public static int oddSum(int n){
        if (n==1){
            return n;
        }else{
            n = n + oddSum(n-2);
            return n;
        }
    }

    /*
    *Recursive definition of the ackerman function
    *
    * @param two positive integers
    * @return int
    */
    public static int ack(int m, int n){
        if (m==0){
            return n+1;
        }else if(m>0 && n==0){
            return ack(m-1, 1);
        }else{
            return ack(m-1, ack(m,n-1));
        }
    }

    /*
    *Takes a double and raises it to the int value
    *
    * @param double and int
    * @return double raised to the int
     */
    public  static double power(double x, int n){
        if (n==0){
            return 1.0;
        }else{
            return x * power(x, n-1);
        }
    }

    public static void main(String[] args){
        System.out.print(power(3.0,2));

    }
}
