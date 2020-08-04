import java.util.Scanner;

public class SwapMoney {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("23000VND/USD");
        System.out.println("USD:");
        double USD=scanner.nextDouble();

        double VND= 23000*USD;
        System.out.println("VND: "+ VND);
    }
}
