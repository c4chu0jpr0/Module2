import java.util.Scanner;

public class CountTotalStudentsReach {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double[] arr;
        int size;

        do {
            System.out.print("Enter in size:");
            size=scanner.nextInt();
            if (size>30){
                System.out.print("Undefined");
            }
        }while (size>30);

        arr= new double[size];
        int k =0;
        while (k<arr.length){
            System.out.print("Score of Students "+(k+1) +": ");
            arr[k]=scanner.nextDouble();
            k++;
        }

        int count =0;
        System.out.print("List of mark: ");
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ "\t");
            if (arr[i]>=5 && arr[i]<=10){
                count++;
            }
        }
        System.out.print("Số lượng sinh viên đạt: "+ count);
    }
}
