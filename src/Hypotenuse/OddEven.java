package Hypotenuse;
import java.util.Scanner;
public class OddEven {
    public static boolean isOdd(int a) {
        if (a % 2 == 1) {
            return (true);
        } else {
            return (false);
        }
    }
    /*
    public static void main(String[] args) {
        System.out.println("Please type in your number");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (isOdd(a)) {
            System.out.println("It is odd");
        }
        else {
            System.out.println("It is even");
        }
    }
*/
    public static void main(String[] args) {
        System.out.println("Please type in your number");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (isOdd(a)) {
            System.out.println("It is odd");
        }
    }
}
