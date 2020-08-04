import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("cân nặng:");
        double weight= scanner.nextDouble();

        System.out.println("chiều cao:");
        double height= scanner.nextDouble();

        double BMI = weight/(height*height);

        String checkBMI;

        if (BMI <18.5) checkBMI="UnderWeight";
        else if (BMI<25) checkBMI="Normal";
        else if (BMI<30) checkBMI="OverWeight";
        else checkBMI="Obese";

        if (checkBMI != "") System.out.printf("Chỉ số '%-10f' có %s", BMI, checkBMI);
    }
}
