import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner= new Scanner(System.in);

        do {
            System.out.print("Tổng số tỉ phú:");
            size= scanner.nextInt();
            if (size>20){
                System.out.println("Undefine");
            }
        }while (size>20);

        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Tỉ phú "+ (i+1)+ " có tài sản: ");
            arr[i]=scanner.nextInt();
            i++;
        }

        int max =arr[0];
        int dem =0;
        for (int j=0; j<arr.length;j++){
            if (max<arr[j]){
                max=arr[j];
                dem=j;
            }
        }
        System.out.print("Tỉ phú có tài sản lớn nhất là: "+ max+ " dollar "+"Vị trí trong danh sách " + (dem+1) );
    }
}
