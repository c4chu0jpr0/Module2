import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr;
        int size1,size2, count;
        double total=0;

        System.out.print("Row:");
        size1=scanner.nextInt();
        System.out.print("Column:");
        size2=scanner.nextInt();

        arr= new double[size1][size2];
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print("Input value " + i + " " + j + " :");
                arr[i][j]=scanner.nextDouble();
            }
        }

        System.out.println(" Do you want to count the column?");
        count=scanner.nextInt();
        for (int i =0;i<arr.length;i++){
                total += arr[i][count];
        }
        System.out.print(total);
    }
}
