import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        isPrime(num);
    }
    private static void isPrime(int num) {
        int i = 2, count = 0;
        if (num == 1 || num == 0) {
            count++;
            System.out.println(num + " is not a prime number.");
        } else {
            while(i<=num/2) {
                if (num%i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 0)
                System.out.println(num + " is prime number");
            else
                System.out.println(num + " is not a prime number.");
        }

    }
}
