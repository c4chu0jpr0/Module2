import java.util.Scanner;

public class designMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw square");
        System.out.println("3. Draw rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        while (true){

        int choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Not choice!");
                    break;
            }
        }
    }
}
