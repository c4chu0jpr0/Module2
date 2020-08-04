import java.util.Scanner;

public class SwapTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit= (celsius*9)/5.0 +32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius= (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Swap F and C");
            System.out.println("1. F-> C");
            System.out.println("2. C-> F");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("F= ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("C= "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("C= ");
                    celsius = scanner.nextDouble();
                    System.out.println("F= "+celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    }
