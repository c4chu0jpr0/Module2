import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int Month;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tháng:");
        Month= scanner.nextInt();

        String daysInMonth;

        switch (Month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth="31";
                break;
            case 2:
                daysInMonth="28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth="30";
                break;
            default:
                daysInMonth="";
        }

        if (daysInMonth != "") System.out.printf("the Month '%d' has %s days!", Month, daysInMonth);
        else System.out.println("Invalid Input");
    }
}
