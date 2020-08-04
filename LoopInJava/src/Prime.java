import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhập số: ");
        int num= scanner.nextInt();
        double n= Math.sqrt(num);

        if (num>=2){
            boolean checkPrime = true;
            for (int i=2; i<=n;i++){
                if (num%i==0 && num!=2){
                    checkPrime=false;
                    break;
                }
                checkPrime= true;
            }
            System.out.println(checkPrime);
        }else {
            System.out.println(false);
        }
    }
}
