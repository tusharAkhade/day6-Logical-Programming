import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 'start' to start the stopwatch: ");
        String startStr = sc.next().toLowerCase();
        long start = System.currentTimeMillis();
        if (startStr.equals("start")) {
            System.out.print("Type 'stop' to stop the stopwatch: ");
            String stopStr = sc.next().toLowerCase();
            while (!stopStr.equals("stop")) {
                System.out.print("Type 'stop' to stop the stopwatch: ");
                stopStr = sc.next().toLowerCase();
            }
            long stop = System.currentTimeMillis();
            long timeElapsed =  stop - start;
            System.out.println("Time = " + timeElapsed + " ms");

        } else {
            System.out.println("Wrong input.");
        }

    }
}
