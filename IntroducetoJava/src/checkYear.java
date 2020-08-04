import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số năm: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;
        boolean isLeapYearby4 = year%4 == 0;
        boolean isLeapYearby100 = year%100 == 0;
        boolean isLeapYearby400 = year%400 == 0;

        if (isLeapYearby4 && isLeapYearby100 && isLeapYearby400) isLeapYear= true;
        else if (isLeapYearby4 && !isLeapYearby100) isLeapYear=true;
        else isLeapYear = false;

        if (isLeapYear) System.out.printf("'%d' là năm nhuận", year);
        else System.out.printf("'%d' không phải là năm nhuận", year);
    }
}
