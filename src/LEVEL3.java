import java.util.Scanner;

public class LEVEL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println("Q1 Celsius to Fahrenheit");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");

        // Q2
        System.out.println("\nQ2 Fahrenheit to Celsius");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is " 
                + celsiusResult + " celsius");

        sc.close();
    }
}