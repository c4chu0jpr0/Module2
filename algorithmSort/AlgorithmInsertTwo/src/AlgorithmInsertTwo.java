import java.util.Scanner;

public class AlgorithmInsertTwo {
    public static void AlgorithmInsert(int[] list){
        for (int i = 0; i <list.length ; i++) {
            int currentEle = list[i];
            int k;
            for (k = i-1; k >=0 && list[k]>currentEle ; k--) {
                list[k+1]=list[k];
            }
            list[k+1]=currentEle;
        }
        System.out.print("Mảng sau khi được sắp xếp: ");
        for (int i : list){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input size: ");
        int size= scanner.nextInt();
        int[] list = new int[size];

        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length ; i++) {
            list[i]=scanner.nextInt();
        }
        AlgorithmInsert(list);
    }
}
