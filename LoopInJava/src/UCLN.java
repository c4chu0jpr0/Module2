import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.println("nhập số nguyên b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a==0 && b==0){
            System.out.println("2 số ko có UCLL");
        }else if (a==0 || b==0){
                if (a>b){
                    a= a- b;
                    System.out.println("có ước chung lớn nhất là: "+ a);
                }else {
                    b= b-a;
                    System.out.println("Có UCLL là: "+ b);
                }
        } else{
            int max=0;
            for (int i =1;i<=a;i++){
                if (a%i==0 && b%i==0){
                    max =i;
                }
            }
            System.out.println(a +" và "+ b +" có ước chung lớn nhất là: "+ max);
        }
    }
}
