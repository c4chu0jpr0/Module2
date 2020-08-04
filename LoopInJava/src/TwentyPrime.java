import java.util.Scanner;

public class TwentyPrime {

     static boolean isPrime(int num){
        boolean check=true;
        double n= Math.sqrt(num);
        for (int i=2; i<=n;i++) {
            if (num%i==0){
                check=false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Nhập số lượng cần in ra:");
        int Numbers=input.nextInt();
        int count=0;
        int N=2;

        while (count<Numbers) {
            if (isPrime(N)){
                System.out.println(N + " : is Prime");
                count++;
            }
            N++;
        }
    }
}
