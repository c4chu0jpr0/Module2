import java.util.Scanner;

public class findArray {
    public static void main(String[] args) {
        String[] rankLoL={"Challenge","Master","Diamond","Platium","Gold","Silver","Brozne"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter is Name: ");
        String inputName= scanner.nextLine();
        boolean findName=false;

        for (int i =1; i<rankLoL.length;i++){
            if (rankLoL[i].equals(inputName)){
                System.out.println("Rank: "+ inputName + " is: "+(i+1));
                findName = true;
                break;
            }
        }
        if (!findName){
            System.out.println("Not found: "+ inputName + " in the list");
        }
    }
}
