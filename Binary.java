/**
 * The Binary class implements to find decimal number after swapping nibbles of binary number
 */

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int dec = s.nextInt();
        toBinary(dec);
    }

    private static void toBinary(int n) {
        int[] binaryNum = new int[20];
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        // reverse the binaryNum array
        for (int l = 0; l<=3; l++) {
            int temp = binaryNum[l];
            binaryNum[l] = binaryNum[7-l];
            binaryNum[7-l] = temp;
        }
        System.out.println("Binary number : ");

        // printing the binaryNum array
        for (int l= 0; l<=7; l++){
            System.out.print(binaryNum[l]);
        }
        nibbleSwap(binaryNum);
    }

    // function "nibbleSwap" swapping the nibbles of binary number
    private static void nibbleSwap(int[] binaryNum) {
        int[] nibbleBinary = new int[20];
        int m = 0;
        // storing 2nd nibble of binaryNum to the 1st nibble position of nibbleBinary
        for (int j=4; j<=7; j++) {
            nibbleBinary[m++] = binaryNum[j];
        }
        // storing 1st nibble of binaryNum to the 2nd nibble position of nibbleBinary
        for (int j=0; j<=3; j++) {
            nibbleBinary[m++] = binaryNum[j];
        }
        System.out.println("\nBinary number after swapping nibble : ");
        for (int l= 0; l<=7; l++){
            System.out.print(nibbleBinary[l]);
        }
        binaryToDecimal(nibbleBinary);
    }

    // function "binaryToDecimal" convert binary to decimal
    private static void binaryToDecimal(int[] ar) {
        long binary = 0;
        for(int i = 0; i < 8; i++)
            binary = binary*10+ar[i];
        long rem = 0;
        long decimal = 0;
        int i = 0;
        while (binary>0) {
            rem = binary%10;
            decimal = (long) (decimal + (rem * Math.pow(2,i)));
            binary = binary/10;
            i++;
        }
        System.out.println("\nDecimal number after swapping the nibbles is :\n" + decimal);
    }
}
