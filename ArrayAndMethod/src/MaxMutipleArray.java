import java.util.Scanner;

public class MaxMutipleArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double[][] arr;
        int size1, size2;

        System.out.print("Rows: ");
        size1 = scanner.nextInt();
        System.out.print("Columns: ");
        size2 = scanner.nextInt();
        arr= new double[size1][size2];
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print("Nhập giá trị vị trí: "+ i +" "+j+ " :");
                arr[i][j]=scanner.nextDouble();
            }
        }

        double max=arr[0][0];
        int x=0;
        int y=0;
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.print("Trong mảng đa chiều có Max= "+ max+ " Có tọa độ: "+ x+ " "+y);
    }
}
