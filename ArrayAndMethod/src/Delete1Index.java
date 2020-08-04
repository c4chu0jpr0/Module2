import java.util.Scanner;

public class Delete1Index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số muốn xóa:");
        int num = scanner.nextInt();
        int i,j;
        int[] array={10,4,6,7,8,6,0,0,0};

        for (i=j=0;i<array.length;i++){
            if (num!=array[i]){
                array[j]=array[i];
                j++;
            }
        }
        System.out.println("Mảng còn lại sau khi xóa: " +num + " là: ");
        for (i=0;i<array.length;i++){
            System.out.print(array[i]+ "\t");
        }
    }
}
