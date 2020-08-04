import java.util.Scanner;

public class AddInArray {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[] arr= {10,3,6,7,8,0,0,0,0,0};

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("");

        System.out.print("Input X:");
        int x=scanner.nextInt();

        System.out.print("vị trí index:");
        int index=scanner.nextInt();

        if (index<=1 || index>= arr.length-1){
            System.out.println("undefined");
        }else {
            for (int i =arr.length-1; i>=arr.length-index-1;i--){
                arr[i]=arr[i-1];
            }
            for (int i=0;i<arr.length;i++){
                arr[index]=x;
                System.out.print(arr[i]+ " ");
            }
        }

    }
}
