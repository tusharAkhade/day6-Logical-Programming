import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        fibonacci(num);
    }
    private static void fibonacci(int num) {
        int n = num;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 1;
        while (i<=num-2) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
        }
    }
}















































