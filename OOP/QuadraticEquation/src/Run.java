import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Enter a, b, c :"+ quadraticEquation.getA()+" "+  quadraticEquation.getB()+" "+ quadraticEquation.getC());
            System.out.println("The equation has two roots "+ quadraticEquation.getRoot1() + " and "+ quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Enter a, b, c :"+ quadraticEquation.getA()+" "+ quadraticEquation.getB()+" "+quadraticEquation.getC());
            System.out.println("the equation has one roots: "+ quadraticEquation.getRoot1());
        }else {
            System.out.println("Enter a, b, c :"+ quadraticEquation.getA()+" "+ quadraticEquation.getB()+" "+quadraticEquation.getC());
            System.out.println("The equation has no real roots");
        }
    }
}
