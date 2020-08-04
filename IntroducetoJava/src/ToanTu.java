import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("chieudai: ");
        width= scanner.nextFloat();

        System.out.println("chieu rong:");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Dien tich: " + area);
    }
}
