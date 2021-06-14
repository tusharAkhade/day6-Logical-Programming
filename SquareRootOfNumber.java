/**
 * The SquareRootOfNumber implements to find the square root of non negative number
 * using Newtons method.
 */

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int c = s.nextInt();        // 'c' stores input number
        final double epsilon = 1E-15;
        float t = c;

        while (Math.abs(t-c/t) > epsilon * t) {
            double lastT = t;       // storing last value of 't'
            t = (float) ((c/t + t)/2.0);        // our new value of 't'
            if ( lastT == t) {              // some number gives a same square root repeatedly
                break;                      // so it will break 'while' loop if a number gives a same square root repeatedly
            }
        }
        System.out.println("Square root of " + c + " : " + t);
    }
}
