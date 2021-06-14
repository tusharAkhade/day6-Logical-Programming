import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int reverse = reverseNum(num);
        System.out.println("Reverse number is: " + reverse);
    }

    private static int reverseNum(int num) {
        int rem = 0;
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp /10;
        }
        return rev;
    }
}
