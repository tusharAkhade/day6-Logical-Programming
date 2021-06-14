import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int perfectNum = perfectNumber(num);
        if (perfectNum == num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }
    private static int perfectNumber(int num) {
        int i = 1;
        int sum = 0;
        for (i=1; i<num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
