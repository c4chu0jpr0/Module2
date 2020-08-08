import java.util.Scanner;

public class checkRun {
    private static void decimalToBinary(){
        Binary binaries = new Binary(7);
        int num=111;
        while (num>=1){
            if (num%2==0){
                num= num/2;
                binaries.push(0);
            }else {
                num=(num-1)/2;
                binaries.push(1);
            }
        }

        System.out.printf("Decimal to Binary : ");

        int count =0;
        int result=0;
        int pop=0;
        while (!binaries.isEmpty()) {
            pop=binaries.pop();
            count=(int) Math.pow(2,binaries.size());
            result += pop*count;
            System.out.printf("%d", pop);
        }

        System.out.println();
        System.out.printf("Decimal to Binary: " + result);
    }
    
    public static void main(String[] args) {
        decimalToBinary();
    }
}
