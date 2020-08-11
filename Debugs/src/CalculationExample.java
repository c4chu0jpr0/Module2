import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y){
        try{
            int a= x+ y;
            int b= x-y;
            int c= x*y;
            int d = x/y;
            System.out.println("x + y = "+a);
            System.out.println("x - y = "+b);
            System.out.println("x * y = "+c);
            System.out.println("x / y = "+d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập x= ");
        int x= scanner.nextInt();

        System.out.print("nhập y= ");
        int y =scanner.nextInt();
        CalculationExample calc= new CalculationExample();
        calc.calculate(x,y);
    }
}
