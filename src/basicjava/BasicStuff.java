package basicjava;
import java.util.Scanner;
import java.lang.Math;
public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 12;
        double age1 = 21;
        System.out.println("We are " + age0 + " and " + age1 + " years old");
        double sumOfAges =  age0 + age1;
        System.out.println("The sum of our ages is  " + sumOfAges + " !" );
        System.out.println("The sum of our ages is  " + (age0 + age1) + " !" );
        System.out.println(6/4);
        System.out.println(6/4.0);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println("Number of weeks in 1600 hours: " + 1600/(24.0*7.0));
        System.out.println("Number of days in 1600 hours: " + 1600/24.0);
        System.out.println("Number of hours in 1600 hours: " + 1600);
        Scanner radiusinput = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double radius = radiusinput.nextDouble();
        Scanner heightinput = new Scanner(System.in);
        System.out.println("Please enter height: ");
        double height = heightinput.nextDouble();
        System.out.println("Volumne is:  " + (1.0/3.0)*Math.PI*radius*radius*height);
        System.out.println("Surface Area is:  " + (Math.PI*radius*radius + Math.PI*radius*Math.sqrt(radius*radius + height*height)));

    }
}
