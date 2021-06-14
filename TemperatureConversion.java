import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for: Celsius to Fahrenheit conversion");
        System.out.println("Enter 2 for: Fahrenheit to Celsius conversion");
        int conversion = s.nextInt();

        switch (conversion) {
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
                break;
            default:
                System.out.println("Enter proper conversion mode.");
                break;
        }
    }

    private static void fahrenheit() {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        final float temp = s.nextFloat();     // it stores the temperature
        float fahrenheit = 0;
        fahrenheit = (temp*9/5) + 32;
        System.out.printf("Fahrenheit : %.1f", fahrenheit);

    }

    private static void celsius() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        float temp = s.nextFloat();     // it stores the temperature
        float celsius = 0;
        celsius = (temp-32)* 5 / 9;
        System.out.printf("Celsius : %.1f", celsius);
    }
}
