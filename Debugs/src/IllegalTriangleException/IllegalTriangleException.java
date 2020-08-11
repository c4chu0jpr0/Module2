package IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("input a:");
            int a= scanner.nextInt();

            System.out.println("input b:");
            int b= scanner.nextInt();

            System.out.println("input c:");
            int c= scanner.nextInt();
            if (a>0 && b>0 && c>0){
                if (a+b >c){
                    if (a+c>b){
                        if (b+c >a){
                            System.out.println("3 cạnh a,b,c hợp thành 1 tam giác");
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Not triangle");
        }
    }
}
