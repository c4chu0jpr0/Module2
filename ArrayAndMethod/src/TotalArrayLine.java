import java.util.Scanner;

public class TotalArrayLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr;
        int size1,size2;
        double total=0;

        System.out.print("Row: ");
        size1=scanner.nextInt();
        System.out.print("Column: ");
        size2=scanner.nextInt();

        arr= new  double[size1][size2];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print("Enter is value:" + i +" "+ j+ " : ");
                arr[i][j]=scanner.nextDouble();
            }
        }
        int j = size2-1;
        for (int i=0; i<arr.length;i++){
            total+= arr[i][i];
            total+= arr[i][j--];
        }

        System.out.print("Total Array Line Main is: "+ total );

    }
}
