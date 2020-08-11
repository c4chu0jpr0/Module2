import java.util.Collections;
import java.util.Scanner;

public class checkrun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        ProductManager pm = new ProductManager();
        do {
            startApp:
            {
                System.out.println("Menu");
                System.out.println("1. add product");
                System.out.println("2. repair product");
                System.out.println("3. remove index");
                System.out.println("4. find index");
                System.out.println("5. swap along Money");
                System.out.println("6. output size");
                System.out.println("7. print");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("input id:");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("input name:");
                        String name = scanner.nextLine();
                        System.out.print("input money:");
                        double money = Double.parseDouble(scanner.nextLine());
                        pm.add(new Product(id, name, money));
                        break;
                    case "2":
                        System.out.println("input index");
                        int index = Integer.parseInt(scanner.nextLine());
                        pm.Repair(index);
                        break;
                    case "3":
                        System.out.println("Input index need remove");
                        int indexRemove = Integer.parseInt(scanner.nextLine());
                        pm.remove(indexRemove);
                        break;
                    case "4":
                        System.out.println("Find index");
                        int indexFind = Integer.parseInt(scanner.nextLine());
                        pm.find(indexFind);
                        break;
                    case "5":
                        System.out.println("Swap");
                        pm.swap();
                        break;
                    case "6":
                        System.out.println(pm.size());
                        break;
                    case "7":
                        pm.printList();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        break startApp;
                }
            }
        } while (true);
    }
}
