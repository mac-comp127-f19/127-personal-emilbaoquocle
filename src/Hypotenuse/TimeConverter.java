package Hypotenuse;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String [] args) {
        Scanner timeinp = new Scanner(System.in);

        System.out.println("Please input the exact hour right now: ");
        int hour = timeinp.nextInt();
        System.out.println("Please input the exact minute right now: ");
        int minute = timeinp.nextInt();
        System.out.println("Please input the exact second right now: ");
        int second = timeinp.nextInt();

        int sum = totalSec(hour,minute,second);
        System.out.println("Total seconds are: " + sum);
    }

    public static int totalSec(int h, int m, int s) {
        return(h*3600 + m*60 + s);
    }
}
