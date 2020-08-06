import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{10, 3, 6, 7, 8, 0, 0, 0, 0, 0};
        int x;
        for (x = 0; x < arr.length; ++x) System.out.print(arr[x] + " ");
        System.out.println("");
        System.out.print("Input X:");
        x = scanner.nextInt();
        System.out.print("vị trí index:");
        int index = scanner.nextInt();
        if (index > 1 && index < arr.length - 1) {
            int i;
            for (i = arr.length - 1; i >= arr.length - index - 1; --i) arr[i] = arr[i - 1];
            for (i = 0; i < arr.length; ++i) {
                arr[index] = x;
                System.out.print(arr[i] + " ");
            }
        } else System.out.println("undefined");
    }
}
