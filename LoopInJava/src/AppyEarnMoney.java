import java.util.Scanner;

public class AppyEarnMoney {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double tiengui= scanner.nextDouble();
        System.out.println("Nhập tỉ lệ lãi suất theo tháng: ");
        double LS= scanner.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        double Month= scanner.nextDouble();

        double tienlai=0;

        for (int i=0;i<=Month;i++){
            tienlai += tiengui*(LS/100)/12*Month;
            System.out.println("tổng tiền lãi: " + tienlai);
        }

    }
}
