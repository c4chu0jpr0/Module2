import java.util.Scanner;

public class countKT {
    public static void main(String[] args) {
        String[] arr;
        int size;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter is size: ");
        size= scanner.nextInt();

        arr = new String[size];
        int k=0;
        while (k<arr.length){
            System.out.print("Enter element "+ (k+1)+ ": ");
            arr[k]=scanner.next();
            k++;
        }

        System.out.print("check characters: ");
        String c=scanner.nextLine();
        int count =0;

        for (int i=0; i< arr.length; i++){
            if (arr[i].equals(c)){
                count++;
            }
        }
        System.out.print("Output: " +count);
    }
}
