package Hypotenuse;
import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {
    public static void main(String [] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Please input your first desirable length: ");
        double length1 = length.nextDouble();
        System.out.println("Please input your second desirable length: ");
        double length2 = length.nextDouble();
        System.out.println(length1 +" " + length2);
        double length3 = calculateHypotenuse(length1,length2);
        System.out.println("Your Hypotenuses lengths are: " + length3);
    }
    public static double calculateHypotenuse(double length1, double length2) {
        return(Math.sqrt(Math.pow(length1,2) + Math.pow(length2,2)));
    }
}

