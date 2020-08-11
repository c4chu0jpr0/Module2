import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr= new Integer[100];
        System.out.println("Danh sách phần tử mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhập 1 kí tự bất kì: ");
        int x= scanner.nextInt();
        try {
            System.out.println("giá trị index " + x+ " là "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn");
        }
    }
}
