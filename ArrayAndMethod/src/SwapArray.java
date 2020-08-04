import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.print("Enter a size:");
            size=scanner.nextInt();
            if(size>20){
                System.out.print("Undefine");
            }
        }while (size>20);

        arr= new int[size];
        int i =0;
        while (i<arr.length){
            System.out.print("Enter element "+ (i+1)+ ": ");
            arr[i]=scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s","Befor Array: ", "");
        for (int j=0; j<arr.length;j++){
            System.out.print(+arr[j] + "\t");
        }
        System.out.println(" ");
        for (int j=0; j<arr.length/2;j++){
            int temp = arr[j];
            arr[j] = arr[size-1-j];
            arr[size-1-j]=temp;
        }
        System.out.printf("%-20s%s","Befor Array: ", "");
        for (int j=0; j<arr.length;j++){
            System.out.print(arr[j]+ "\t");
        }
    }
}
