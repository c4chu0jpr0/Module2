import java.util.Scanner;

public class GatherArray {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        Scanner scanner = new Scanner(System.in);
        int size1,size2;
        int j=0;
        int y =0;

        do {
            System.out.print("Enter a size in Array1:");
            size1=scanner.nextInt();
            if (size1>20){
                System.out.println("undefined");
            }
        }while (size1>20);
        arr1=new int[size1];
        while (j<arr1.length){
            System.out.print("Nhập số vào mảng "+ (j+1)+": ");
            arr1[j]=scanner.nextInt();
            j++;
        }

        do {
            System.out.print("Enter a size in Array2:");
            size2=scanner.nextInt();
            if (size2>20){
                System.out.println("undefined");
            }
        }while (size2>20);
        arr2 = new int[size2];
        while (y<arr2.length){
            System.out.print("Nhập số vào mảng "+ (y+1)+": ");
            arr2[y]=scanner.nextInt();
            y++;
        }

        int[] arr3;
        arr3 = new int[size1+size2];
        for (int k=0; k<arr3.length;k++){
            for (int i=0; i < arr1.length;i++){
                if (k==i) {
                    arr3[k] = arr1[i];
                }
            }
        }
        for (int k=size1;k<arr3.length;k++){
            for (int i=0; i<arr2.length;i++){
                if(k==(i+size1)) {
                    arr3[k] = arr2[i];
                }
            }
        }
        for (int i=0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
