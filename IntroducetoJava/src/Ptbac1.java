import java.util.Scanner;

public class Ptbac1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        System.out.println("Giải hệ phương trình bậc 1");
        System.out.println("Hệ pt có dạng 'a*x +b = c', nhấn enter để tiếp tục ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("hệ số a: ");
        a = scanner.nextDouble();

        System.out.println("hệ số b: ");
        b = scanner.nextDouble();

        System.out.println("hệ số c: ");
        c = scanner.nextDouble();

        if (a != 0){
            double result= (c-b)/a;
            System.out.printf("Phương trình có nhiệm x = %f!\n", result);
        }else {
            if (b==0){
                System.out.print("Phương trình vô số nhiệm: ");
            } else {
                System.out.print("Phương trình vô nhiệm");
            }
        }

    }
}
