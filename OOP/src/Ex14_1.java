import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width= scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height= scanner.nextDouble();

        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("You rectangle dis play \n"+ rectangle.display());
        System.out.println("Area= "+ rectangle.getArea());
        System.out.println("Perimeter= "+ rectangle.getPerimeter());
    }

}
