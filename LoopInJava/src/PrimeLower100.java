import java.util.Scanner;

public class PrimeLower100 {

    static boolean checkPrime(int number){
        double n= Math.sqrt(number);
        boolean check=true;
        for (int i =2;i<=n;i++){
            if(number%i==0){
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giới hạn số:");
        int num= scanner.nextInt();

        for (int i=2; i<=num;i++){
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }
}
